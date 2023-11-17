package EncodeDecode;

public class CypherMessage {
    private String key;
    private String message;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public String getMessage() {
        return this.message;
    } 

    public void setMessage(String message) {
        this.message = message;
    }
}