import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

    @Override//Compare by name.
    public int compare(Person p1, Person p2){
        //returns negative value if st2 is before st1, and positive if after.
        return p1.getFirstName().compareTo(p2.getFirstName());
    
    }//End compare
}//End NameComparator 