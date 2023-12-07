// Declare UserPrompt class to be part of the EncodeDecode package
package EncodeDecode;
// Importing Scanner class to prompt users for input
import java.util.Scanner;
// Declare new class for UserPrompt
public class UserPrompt {
   // Declare startProgram method that initializes the program
   public String startProgram() {
      // Assign new scanner object
      Scanner userInput = new Scanner(System.in);
      // Assign variable cypherMessage to new instance of the CypherMessage class
      CypherMessage cypherMessage = new CypherMessage();
      // Output message to prompt a user to enter a message
      System.out.println("Input phrase to be altered: ");
      // Declare and initialize variable to prompt user to enter message
      String userMessage = userInput.nextLine();
      // Output message to prompt a user to enter a key for the cypher
      System.out.println("Input cypher key: ");
      // Declare and initialize variable to prompt user to enter cypher key
      int userKey = userInput.nextInt();
      // Declare variable for prompted user action
      String userAction;
      // Declare variable for returned value from encoding/decoding
      String outputtedMessage;
      // Set message for cypherMessage object to what user entered
      cypherMessage.setMessage(userMessage);
      // Set key for cypherMessage object to what user entered
      cypherMessage.setKey(userKey);
      // Do while loop to enforce the values "encode" or "decode" to be entered for userAction
      do {
         // Output message to prompt a user to enter a what action they would like to perform, encode or decode
         System.out.println("Please enter either \"encode\" or \"decode\" depending on which action you would like to perform. ");
         // Prompt user to enter action, encode or decode
         userAction = userInput.next();
         // While look passes the userAction and cypherMessage to validUserAction action to determine if userAction is a valid option
      } while (!validUserAction(userAction, cypherMessage));
      // Set CypherMessage object action to user inputed value
      cypherMessage.setAction(userAction);
      // Declare and initialize variable for Algorithm class
      Algorithm algorithm = new Algorithm();
      // Assign outputtedMessage variable to return string value of algorithmize method
      outputtedMessage = algorithm.algorithmize(cypherMessage);
      // Return the string value of outputtedMessage
      return outputtedMessage;
   }
   // Private method that returns true if a userAction is equal to either "encode" or "decode" being case-insensitive
   private Boolean validUserAction(String userAction, CypherMessage cypherMessage) {
      // Return boolean value if action matches encode or decode
      return (userAction.equalsIgnoreCase(cypherMessage.ACTION_DECODE) || userAction.equalsIgnoreCase(cypherMessage.ACTION_ENCODE));
   }
}