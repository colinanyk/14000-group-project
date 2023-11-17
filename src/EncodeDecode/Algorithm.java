package EncodeDecode;

public class Algorithm {
    public String algorithmize(CypherMessage cypherMessage, String action) {

        if (action.equals(cypherMessage.ACTION_ENCODE)) {
            System.out.println("ENCODE Algorithmize");
        }

        if (action.equals(cypherMessage.ACTION_DECODE)) {
            System.out.println("DECODE Algorithmize");
        }

        return String.format("key: %s algorithmize message: %s%n", cypherMessage.getKey() ,cypherMessage.getMessage(), action);
    }
}