import EncodeDecode.UserPrompt;

public class Main {
    public static void main(String[] args) {
        UserPrompt userPrompt = new UserPrompt();
        String returnedMessage = userPrompt.startProgram();

        System.out.printf("outputtedMessage: %s%n", returnedMessage);
    }
}