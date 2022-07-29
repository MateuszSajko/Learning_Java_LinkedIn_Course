import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
        // Lesson 2
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

        // Lesson 3 Fortune teller
        System.out.println("Pick a number between 1 and 10");
        int choice = scanner.nextInt();
        System.out.println("Your choice is " + choice);
        if (choice < 5){
            System.out.println("Enjoy the good luck a friend brings you");
        } else{
                System.out.println("Your shoe selection will make you happy");
            }
            */
        // Lesson 3.6 - While loop
       /* Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing ABC song");
            System.out.println("Would you like to take this song off of repeat? Is so, answer yes");

            String userInput = input.next();


            if (userInput.equals("yes")) {
                isOnRepeat = false;
            } else {
                isOnRepeat = true;
                System.out.println("Song called ABC is on the loop");
            }
        }
        System.out.println("Currently playing new song");

        */
        // Lesson 3.7 Multiple choice
        System.out.println("Do you think this is true? Choose from your answer \n 1) yes \n 2) no  \n 3) maybe ");
        Scanner scann = new Scanner(System.in);
        String answer = scann.nextLine().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("Your answer is " + answer + ". Good Job!");
        }else if (answer.equals("no")) {
            System.out.println("Your answer is " + answer +". Not good job...");
        } else{
            System.out.println("Your answer is " + answer + " You are not sure what to do?");



        }

    }

}



