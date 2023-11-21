package EncodeDecode;

import java.util.Random;

public class Algorithm {

    public String algorithmize(CypherMessage cypherMessage, String action) {
        
        if (action.equals(cypherMessage.ACTION_ENCODE)) {
            System.out.println("ENCODE Algorithmize");
         
         //encode algorithm process starts here, edited 11/19/2023 
         int i;
         int key = 63134133; //key needs to integer, for now. No quick or simple way of converting string phrases to an integer.
         char[] cArray = cypherMessage.getMessage().toCharArray(); //convert message to char array
    
         int range = 255; //0 to 255 ascii range, wont throw errors;
         int rand; //this will be the integer created from the random key used to adjust the ascii values
         Random randomize = new Random();
         randomize.setSeed(key); //sets random pattern with key value
    
    
         //encode for-loop, the "magic" process of jumbling the message
         rand = (int)(randomize.nextInt(range)); 
         
         for(i=0; i < cArray.length ;i++){
            cArray[i] = (char) (cArray[i] + rand);
         }
         
         // algorithm jumbling process ends here
         
         //convert char array back to string
         String str = String.copyValueOf(cArray);
         cypherMessage.setMessage(str); //str string is thrown to setMessage in cypherMessage class and replaces former string that was just altered.
        }

        if (action.equals(cypherMessage.ACTION_DECODE)) { //Process here for decoding will work similarly as above, just in the opposite order. Still a few kinks setting random key but have it nearly working.
            System.out.println("DECODE Algorithmize");
        }

        return cypherMessage.getMessage();
    }
}