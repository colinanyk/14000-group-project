package EncodeDecode;

public class Decode {
    public String decodeMessage(CypherMessage cypherMessage) {
        Algorithm algorithm = new Algorithm();
        return algorithm.algorithmize(cypherMessage);
    }
}