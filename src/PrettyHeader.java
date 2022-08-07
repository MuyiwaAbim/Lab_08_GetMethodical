import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        String input = "";
        Scanner in = new Scanner(System.in);
        SafeInput.prettyHeader(in, "Special string is: ", "Hello");
    }
}