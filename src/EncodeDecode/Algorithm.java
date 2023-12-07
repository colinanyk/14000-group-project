package EncodeDecode;

import java.util.Random;
import java.util.Scanner; 

public class Algorithm {

    public String algorithmize(CypherMessage cypherMessage, String action) {
        
        if (action.equals(cypherMessage.ACTION_ENCODE)) {
            System.out.println("ENCODE Algorithmize");
         
         //encode algorithm process starts here, edited 11/19/2023 - GM
         int i;
         String keyString = cypherMessage.getKey();
         int key = Integer.parseInt(keyString);
         char[] cArray = cypherMessage.getMessage().toCharArray(); //convert message to char array
         
         int range = 94; //32 to 126 ascii range, wont throw errors or weird characters;
         int rand; //this will be the integer created from the random key used to adjust the ascii values
         Random randomize = new Random();
         randomize.setSeed(key); //sets random pattern with key value
         rand =  (int)(randomize.nextInt(range));
         // System.out.println(rand); debug line
         
         //encode for-loop, the "magic" process of jumbling the message
         for(i=0; i < cArray.length ;i++){
         //System.out.println(cArray[i] + " to ");
            if((cArray[i] + rand) > 126){
               cArray[i] = (char) ((cArray[i] + rand) - 95);
               //System.out.println( cArray[i]);
               }
            else{
            
            cArray[i] = (char) (cArray[i] + rand);
            //System.out.println( cArray[i]);
            }
   
         }
         
         //algorithm jumbling process ends here
         
         //convert char array back to string
         String str = String.copyValueOf(cArray);
         cypherMessage.setMessage(str); //str string is thrown to setMessage in cypherMessage class and replaces former string that was just altered.
        }

        if (action.equals(cypherMessage.ACTION_DECODE)) { //Process here for decoding will work similarly as above, just in the opposite order. edited 12/6/23 - GM     
         int j;
         String keyString = cypherMessage.getKey();
         int key = Integer.parseInt(keyString);
         char[] cArray = cypherMessage.getMessage().toCharArray(); //convert message to char array
         
         int range = 94; //for 32 to 126 ascii range, wont throw errors or weird characters;
         int rand; //this will be the integer created from the random key used to adjust the ascii values
         Random randomize = new Random();
         randomize.setSeed(key); //sets random pattern with key value
         rand = (int)(randomize.nextInt(range));
         //System.out.println(rand); debug line

         
         for(j=0; j < cArray.length ;j++){
         //System.out.println( cArray[j] + " to ");
            if((cArray[j] - rand) < 32){ //for chars exceeding ascii range with shifted amount
               cArray[j] = (char) ((cArray[j] + 95) - rand);
              // System.out.println( cArray[j]);
              }
            else{
            cArray[j] = (char) (cArray[j] - rand);
            //System.out.println( cArray[j]);
            }
            
         String str = String.copyValueOf(cArray);
         cypherMessage.setMessage(str);
 
         }
            
        }

        return cypherMessage.getMessage();
    }
}