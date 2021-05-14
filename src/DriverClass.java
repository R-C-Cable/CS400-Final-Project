import java.util.Scanner;
public class DriverClass {

    private static Scanner in = new Scanner(System.in);
    private static Queue<Person> queue = new Queue<Person>();

    public static void main(String[] args) {
        NameComparator byName = new NameComparator();
        AgeComparator byAge = new AgeComparator();

        // Gets 5 people's info from user, and stores them in a queue.
        getInput();

        //Displays queue before sorting
        System.out.println("------------------");
        System.out.println("Unsorted Queue:");
        queue.displayAll();

        //Quick Sorts queue by name and then displays the queue
        System.out.println("------------------");
        System.out.println("Quick Sorted Descending by Name:");
        queue.sort(byName);
        queue.displayAll();

        //Quick Sorts queue by age, and then displays the queue.
        System.out.println("------------------");
        System.out.println("Quick Sorted Descending by Age:");
        queue.sort(byAge);
        queue.displayAll();

    }// end Main

    //Method to get input of peoples info form user.
    private static void getInput() {
        int attempts = 0, maxAttempts = 3;//Limits errors cases

        System.out.println("");
        System.out.println("Please input 5 People's Info:");

        for (int i = 0; i < 5; i++) {
            try {//Gets 5 peoples info with exception handling.
                System.out.println("------------------");
                System.out.println("Person #" + (i + 1));
                System.out.print("First Name: ");
                String firstName = in.nextLine();

                System.out.print("Last Name: ");
                String lastName = in.nextLine();

                System.out.print("Age:");
                int age = in.nextInt();
                in.nextLine();// clears scanner
                if (age < 0 || age > 130) throw new Exception("Invalid age");//Validates age.

                queue.enqueue(new Person(firstName, lastName, age));
            }catch (Exception e) {
                i--;
                System.out.println(e);
                System.out.println("Try Again");

                if (attempts < maxAttempts) {
                    attempts++;
                } else {
                    break;
                }
            } // end try-catch
        } // End program while-loop
    }// End of getInput

}//End Driver Class
