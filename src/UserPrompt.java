import java.util.Scanner

public class UserPrompt() {


   public static void main(String[] args){
   Scanner userInput = new Scanner(System.in)

   System.out.println("Input phrase to be altered: ");
   String userMessage = userInput.nextLine();

   System.out.println("Imput cypher key: ");
   String userKey = userInput.nextLine();


   cypherMessage cm = new cycpherMessage;
   cm.setKey(userKey);
   cm.setMessage(userMessage);
   

}

}