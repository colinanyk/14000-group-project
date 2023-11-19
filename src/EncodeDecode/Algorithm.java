package EncodeDecode;

public class Algorithm {

    public String algorithmize(CypherMessage cypherMessage, String action) {
        
        if (action.equals(cypherMessage.ACTION_ENCODE)) {
            System.out.println("ENCODE Algorithmize");
         
         //encode algorithm process starts here, edited 11/19/2023 
         int i;
         int key = 63134133; //key needs to integer, for now. No quick or simple way of converting string phrases to an integer.
         char[] cArray = cypherMessage.toCharArray(); //convert message to char array
    
         int range = 255; //0 to 255 ascii range, wont throw errors;
         int rand; 
         Random randomize = new Random();
         randomize.setSeed(key); //sets random pattern with key value
    
    
         //encode for-loop, the "magic" process of jumbling the message
         rand = (int)(randomize.nextInt(range)); 
         
         for(i=0; i < cArray.length ;i++){
         cArray[i] = (char) (cArray[i] + rand);
         System.out.print(cArray[i]);
         }
         
         // algorithm jumbling process ends here
         
         //convert char array back to string
         String str = String.copyValueOf(cArray);
         cypherMessage.setMessage(str);                    //!!!!!!THIS NEEEDS TO BE TESTED!!!!!!!!! String str is the final encoded message, unsure how to return it properly
     
        }

        if (action.equals(cypherMessage.ACTION_DECODE)) {
            System.out.println("DECODE Algorithmize");
        }

        return String.format("key: %s algorithmize message: %s%n", cypherMessage.getKey() ,cypherMessage.getMessage(), action);
    }
}