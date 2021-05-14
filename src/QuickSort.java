import java.util.Comparator;
import java.util.LinkedList;

public class QuickSort<T> {
    /*This method creates pivot. places it in the center of the array,
    and then places all element that are greater than the pivot to the right
    and all elements that are smaller than the array to the left. */
    private int partition(LinkedList<T> personList, int begin, int end, Comparator<T> comparator){
        int pivot = end;
        int counter = begin;
    
        /*iterates throw array finds elements larger than pivot,
        and moves them to the right*/
        for(int i = begin; i < end; i++){

            if (comparator.compare(personList.get(i), personList.get(pivot)) <= 0){
                T temp = personList.get(counter);
                personList.set(counter, personList.get(i));
                personList.set(i, temp);
                counter++;
            }
        }
        /*swaps element of correct pivot location with pivot. 
        leaving said element at end of array.*/
        T temp = personList.get(counter);
        personList.set(counter, personList.get(end));
        personList.set(end, temp);

        return counter;
    }

    //recursive quickSort
    public void quickSort(LinkedList<T> personList, int begin, int end, Comparator<T> comparator){
        //arrayPrinter(array);//test code
        if (begin < end){
            int pivot = partition(personList, begin, end, comparator);
            //System.out.println(pivot + ": " + array[pivot]);//test code
        
        quickSort(personList, begin, pivot - 1, comparator);//recursively sorts array < pivot
        quickSort(personList, pivot + 1, end, comparator);//recursively sorts array > pivot
        }
    }
    //Case if begin and end are not input.
    public void quickSort(LinkedList<T> personList, Comparator<T> comparator){
        int begin = 0;
        int end = personList.size() - 1;
        quickSort(personList, begin, end, comparator);//calls quickSort with correct perimeters.
    }
}