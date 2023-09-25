public class Palindrome {
    public static void main(String[] args) {
        int n = 353, reverse = 0, original = n, remainder;
        while (n > 0) {
            remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n /= 10;
        }
        if (original == reverse) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
// note that 1%10 is 1 and floor division 1//10 is 0
