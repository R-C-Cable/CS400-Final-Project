import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Queue<T> {

    private LinkedList<T> queue = new LinkedList<T>();

    //Adds elements to front of queue
    public void enqueue(T newEntry){
        queue.addFirst(newEntry); 
    }

    //Removes and returns oldest entry
    public T dequeue(){
        return queue.removeLast();
    }

    //returns element of oldest entry without changing it.
    public T getFront(){
        return queue.peekLast();
    }

    //Returns true if empty, or false if not.
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //Removes every element in the queue returns nothing.
    public void clear(){
        queue.clear();
    }

    //Returns string of queue
    public String toString(){
        String result = "";
        while (!queue.isEmpty()){
            result = (result + ", " + dequeue());
        }
        return result;
    }

    //Displays all entries using toString
    public void displayAll(){
        ListIterator<T> listIterator = queue.listIterator(queue.size());

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    //Sorts queue based on comparator
    public void sort(Comparator<T> comparator){
        QuickSort<T> sort = new QuickSort<T>();
        sort.quickSort(queue, comparator);
    }
    
}
