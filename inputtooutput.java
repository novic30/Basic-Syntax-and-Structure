import java.util.Scanner;

public class inputtooutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        System.out.println("Output: " + input);
    }
}
