import java.util.Scanner;

public class reverseString {

    /**
     * Reverses a string
     *
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

   /* write a main method to get input from terminal and print the reversed string */
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the string to reverse: ");
       String str = sc.nextLine();
       System.out.println("Reversed string: " + reverse(str));
   }
}
