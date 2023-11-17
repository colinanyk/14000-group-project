package EncodeDecode;

import java.util.Scanner;

public class UserPrompt {
   public void startProgram() {
      Scanner userInput = new Scanner(System.in);
      CypherMessage cm = new CypherMessage();

      System.out.println("Input phrase to be altered: ");
      String userMessage = userInput.nextLine();

      System.out.println("Input cypher key: ");
      String userKey = userInput.nextLine();

      cm.setKey(userKey);
      cm.setMessage(userMessage);

      System.out.printf("Message: %s%n", cm.getMessage());
      System.out.printf("Key: %s%n", cm.getKey());
   }
}