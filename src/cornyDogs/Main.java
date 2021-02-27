package cornyDogs;


import lib.ConsoleIO;

public class Main {

    public static void main(String[] args) {

        String emptyInput = ConsoleIO.promptForString("Give empty input.", true);
        System.out.println("Empty Input: " + emptyInput);

        String input = ConsoleIO.promptForString("Give non-blank input: ", false);
        System.out.println("Non-empty input: " + input);

        //PROMPT FOR INT

        int num = ConsoleIO.promptForInt("Enter a whole number between 1 and 10: ", 1, 10);
        System.out.println("Num: " + num);

        //PROMPT FOR BOOLEAN

        ConsoleIO.promptForBoolean("This should throw an exception", "Y", "n");
        ConsoleIO.promptForBoolean(null, null, null);

        //MENU SELECTION RETURNS NULL

        ConsoleIO.promptForMenuSelection(null, false);

        boolean isTrue =  ConsoleIO.promptForBoolean("Enter Y: ", "y", "n");
        System.out.println("isTrue: " + isTrue);

        boolean isFalse =  ConsoleIO.promptForBoolean("Enter Y: ", "y", "n");
        System.out.println("isTrue: " + isFalse);

        //String array
        String[] options = {
                "Option 1: Krull",
                "Option 2: Avengers end game",
                "Option 3: StepBrothers",
                "Option 4: Titan A.E",
                "Option 5: The greatest showman",
                "Option 6: gone in 60 seconds",
        };

        int choice =  ConsoleIO.promptForMenuSelection(options, false);
        System.out.println("Choice:  " + choice);
        //ALL THESE THROW EXCEPTIONS
        System.out.println("END");

    }
}
