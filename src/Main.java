import java.lang.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        String password = "Summer2026!";
        byte[] input = password.getBytes(StandardCharsets.UTF_8);


        System.out.println(password);
        System.out.println(Arrays.toString(input));
    }
}