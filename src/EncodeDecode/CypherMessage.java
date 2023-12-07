// Declare EncodeDecode class to be part of the EncodeDecode package
package EncodeDecode;
// Declare new class for CypherMessage
public class CypherMessage {
    // Declare integer variable key
    private int key;
    // Declare string variable message
    private String message;
    // Declare string variable action
    private String action;
    // Declare a protected immutable variable for action decode
    protected final String ACTION_DECODE = "decode";
    // Declare a protected immutable variable for action encode
    protected final String ACTION_ENCODE = "encode";
    // Create getter method that returns private key variable
    public int getKey() {
        return this.key;
    }
    // Create setter method that sets private key variable
    public void setKey(int key){ this.key = key; }
    // Create getter method that returns private message variable
    public String getMessage() {
        return this.message;
    }
    // Create setter method that sets private message variable
    public void setMessage(String message) {
        this.message = message;
    }
    // Create getter method that returns private action variable
    public String getAction() {return this.action;}
    // Create setter method that sets private action variable
    public void setAction(String action) { this.action = action; }
}