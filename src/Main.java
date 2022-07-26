import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     /*  int studentAge = 15;
       double studentGPA = 3.45;
       boolean hasPerfectAttendance = true;
       String studentFirstName = "Mateusz";
       String studentLastName = "Sajko";
       char studentFirstInitial = studentFirstName.charAt(0);
       char studentLastInitial = studentLastName.charAt(0);

       System.out.println(studentAge);
       System.out.println(studentGPA);
       System.out.println(studentFirstInitial);
       System.out.println(studentLastInitial);
       System.out.println(hasPerfectAttendance);
       System.out.println(studentFirstName);
       System.out.println(studentLastName);
        double studentGPA = 3.45;
        String studentFirstName = "Mateusz";
        String studentLastName = "Sajko";
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What do you want to update it to ?");

        studentGPA = scanner.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + "has a GPA of " + studentGPA);
        */
        // Lesson 3 Fortune teller
        System.out.println("Pick a number between 1 and 10");
        int choice = scanner.nextInt();
        System.out.println("Your choice is " + choice);
        if (choice < 5){
            System.out.println("Enjoy the good luck a friend brings you");
        } else{
                System.out.println("Your shoe selection will make you happy");
            }



    }
}
