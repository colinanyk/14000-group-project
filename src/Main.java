// Importing UserPrompt class to initialize the Encode Decode program
import EncodeDecode.UserPrompt;

// Declare new class for Main
public class Main {
    // Declare main method
    public static void main(String[] args) {
        // Assign variable to a new UserPrompt class
        UserPrompt userPrompt = new UserPrompt();
        // Assign variable to the returned value from startProgram();
        String returnedMessage = userPrompt.startProgram();

        // Output returned value from Encode Decode program
        System.out.printf("outputtedMessage: %s%n", returnedMessage);
    }
}