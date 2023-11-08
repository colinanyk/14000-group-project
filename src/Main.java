import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String key = scnr.nextLine();
        String message = scnr.nextLine();

        CypherMessage cypherMessage = new CypherMessage();
        cypherMessage.setKey(key);
        cypherMessage.setMessage(message);

        System.out.printf("key: %s%n", cypherMessage.getKey());
        System.out.printf("message: %s%n", cypherMessage.getMessage());
    }
}