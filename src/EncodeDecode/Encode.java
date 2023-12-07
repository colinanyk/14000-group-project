// Declare EncodeDecode class to be part of the EncodeDecode package
package EncodeDecode;
// Declare new class for Encode
public class Encode {
    // Declare encodeMessage method that passes Cypher Message
    public String encodeMessage(CypherMessage cypherMessage) {
        Algorithm algorithm = new Algorithm();
        return algorithm.algorithmize(cypherMessage);
    }
}