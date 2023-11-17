package EncodeDecode;

public class Encode {
    public String encodeMessage(CypherMessage cypherMessage) {
        Algorithm algorithm = new Algorithm();

        String encodedMessage = algorithm.algorithmize(cypherMessage, cypherMessage.ACTION_ENCODE);
        return encodedMessage;
    }
}