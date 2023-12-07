package EncodeDecode; //states this class is bundled with other classes in the EncodeDecode folder

import java.util.Random; //imports java's random class used to create an obj, which is used here for creating random values in a repeatable manner using a seed

public class Algorithm {//states class header

    final int range = 94; // this is used for the randomizer object to generate a random value only from 0-94, so values don't shift past the range of ASCII characters being used.
                          //using 32 to 126 ascii range, wont throw errors or weird characters;
                          
    public String algorithmize(CypherMessage cypherMessage, String action) { //states algorithmize method, returns either a encoded/decoded string from two string inputs message and action
    
         int i; //used in for loop indexing
         int key = Integer.parseInt( cypherMessage.getKey() ); //parses key as integer from the user inputted string
         char[] charArray = cypherMessage.getMessage().toCharArray(); //convert message to char array
         int rand; //this will be the integer created from the random key used to adjust the ascii values
         
         Random randomize = new Random(); //creates obj from Java's random
         randomize.setSeed(key); //sets a distinct random numerical pattern with key value
         rand = (int)(randomize.nextInt(range)); //finds next integer in the numerical pattern stored in randomize object and assigns it to variable "rand", used further down
         
        
        
        if (action.equals(cypherMessage.ACTION_ENCODE)) { //if statement for when user had inputted encode
            System.out.println("ENCODE Algorithmize"); //lets user know encode has triggered
         
         //encode for loop algorithm process starts here, this shifts the ascii value then re-assigns it back into the same position in the array
         for(i=0; i < charArray.length ;i++){ //for loop runs from the 0 to end, adjusts end to length of message (charArray). increments i by 1 each time
         
            if((charArray[i] + rand) > 126){ //for chars exceeding ascii range with rand value. 
               charArray[i] = (char) ((charArray[i] + rand) - 95);} //the values of the characters exceeding 126 shift up the remaining amount from the bottom of the range
              
            else{
            charArray[i] = (char) (charArray[i] + rand);}//if the value dont exceed top of ascii range, they simply shift up by random generated value
   
         }
         //algorithm jumbling process ends here
         
         String encodeStr = String.copyValueOf(charArray); //takes the array of characters that was altered and puts them back into string format.
         cypherMessage.setMessage(encodeStr); //encoded string is thrown to setMessage in cypherMessage class,replacing the string that was just altered.
        }



        if (action.equals(cypherMessage.ACTION_DECODE)) { //Process here for decoding will work similarly as above, just in the opposite order. Triggers when user inputs decode 

         //same jumbling process but the if/else algorithm is altered to undo the jumbling back into the original values so long the same key is inputted
         for(i=0; i < charArray.length ;i++){
         
            if((charArray[i] - rand) < 32){ //for the chars that had previosuly exceeded ascii range with rand value. 
            charArray[i] = (char) ((charArray[i] + 95) - rand);} //the values shift back down from the top of the range using the remaining amount
            
            else{
            charArray[i] = (char) (charArray[i] - rand);} //shifts the other characters back down by the random generated value
            
         String decodeStr = String.copyValueOf(charArray); //takes the array of characters that was altered and puts them back into string format.
         cypherMessage.setMessage(decodeStr); //decoded string is thrown to setMessage in cypherMessage class,replacing the string that was just altered.
 
         }
            
        }


        return cypherMessage.getMessage(); //throws back either encoded or decoded string after the corresponding if statement triggers
    }
}