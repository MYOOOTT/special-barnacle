import java.util.Scanner;

public class TestScoresView {

    private TestScoresModel model;

    public TestScoresView(TestScoresModel m) {
        model = m;
        run();
    }

    //menu driven command loop
    private void run() {
        while (true) {
            System.out.println("Number of students: " + model.size());
            System.out.println("Index of current student: " +
                model.currentPosition());
            displayMenu();
            int command = getCommand("Enter a number [1-11]: ", 
                    1, 11);
                    System.out.println("Command: " + command);
            if (command == 11)
                break;
            runCommand(command);
        }
    }

    private void displayMenu() {

        String s1 = "\r(1) Add student";
        String s2 = "\r(2) Replace student";
        String s3 = "\r(3) Examine first student";
        String s4 = "\r(4) Examine next student";
        String s5 = "\r(5) Examine previous student";
        String s6 = "\r(6) Examine last student";
        String s7 = "\r(7) Check size of classroom";
        String s8 = "\r(8) Get test average of class";
        String s9 = "\r(9) Get student with highest score";
        String s10 = "\r(10) Get current student's stats";
        String s11 = "\r(11) Exit menu";

        String[] menu = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11};
        for (String s: menu) 
            System.out.println(s);

    }
    //prompts the user for a command number and runs until the user
    //enters a valid command number
    //parameters: prompt is the string to display
    //low is smallest command number
    //hgih is the alrgest command number
    //returns: a valid command number (>= low && <= high)
    private int getCommand(String prompt, int low, int high) {
        //Exercise: recover from all input errors
        Scanner reader = new Scanner(System.in);
        System.out.println(prompt);
        int commandNumber = low - 1;
        while (!reader.hasNextInt()) {
            System.out.println("You didn't even put an integer!");
            System.out.println(prompt);
            reader.next();
        }
        commandNumber = reader.nextInt();
        
        while (commandNumber > high || commandNumber < low ) {
                    System.out.println("Please put in an integer inbetween" +
                        low + " and " + high + "\n");
                    System.out.println(prompt);
                    commandNumber = reader.nextInt();
        }
        System.out.println("Command Number = " + commandNumber);
        
        return commandNumber;
    }


    //Selects a command to run based on a command number,
    // runs the command, and asks the user to continue by
    // pressing the Enter key   
    private void runCommand(int command) {
        Scanner reader = new Scanner(System.in);
        if (command == 1) { //adding a student
        }
        System.out.println("Press ENTER to continue.");
        reader.nextLine();
        run();
    }
}
