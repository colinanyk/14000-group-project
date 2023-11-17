package EncodeDecode;

public class Decode {
    public String decodeMessage(CypherMessage cypherMessage) {
        Algorithm algorithm = new Algorithm();
        String encodedMessage = algorithm.algorithmize(cypherMessage, cypherMessage.ACTION_DECODE);
        return encodedMessage;
    }
}