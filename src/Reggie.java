import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        String input = "";
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in, "Please enter a social security number " +
                "in the correct format: ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);

        String mNum = SafeInput.getRegExString(in, "Please enter a UC student-M number " +
                "in the correct format: ", "(M|m)\\d{5}");
        System.out.println(mNum);

        String menuChoice = SafeInput.getRegExString(in, "Please enter a menu choice " +
                "in the correct format: ", "[OoSsVvQq]");
        System.out.println(menuChoice);
    }
}
