package EncodeDecode;

import java.util.Scanner;

public class UserPrompt {
   public String startProgram() {
      Scanner userInput = new Scanner(System.in);
      CypherMessage cm = new CypherMessage();

      System.out.println("Input phrase to be altered: ");
      String userMessage = userInput.nextLine();

      System.out.println("Input cypher key: ");
      String userKey = userInput.nextLine();

      System.out.println("Do you want to encode or decode?");
      String userAction = userInput.nextLine();

      String outputtedMessage;

      cm.setMessage(userMessage);
      cm.setKey(userKey);

      // TODO: This should be replaced with a while loop to check if the user has put in a valid action; encode or decode only.
      if (userAction.equalsIgnoreCase(cm.ACTION_ENCODE)) {
         Encode encode = new Encode();
         outputtedMessage = encode.encodeMessage(cm);
      } else if (userAction.equalsIgnoreCase(cm.ACTION_DECODE)) {
         Decode decode = new Decode();
         outputtedMessage = decode.decodeMessage(cm);
      } else {
         outputtedMessage = "Did not put in a valid message";
      }

      return outputtedMessage;
   }
}