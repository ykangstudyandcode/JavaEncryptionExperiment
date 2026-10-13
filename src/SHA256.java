import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public class SHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        /*
        This program demonstrates the use of SHA-256 hashing to secure a password.
        */

        String password = "Summer2026!";
        byte[] input =password.getBytes(StandardCharsets.UTF_8);

        //Make a SHA256 object;
        MessageDigest ms = MessageDigest.getInstance("SHA-256");
        //Hash the password
        byte[] hash = ms.digest(input);

        //Print the hash in hexadecimal format
        System.out.println("SHA-256 Hash of the password: ");
        System.out.println(HexFormat.of().formatHex(hash));
    }
}
