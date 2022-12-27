public class recursion {
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

// Write a recursive method that finds the maximum element in an array.

// Write a recursive method that calculates the Fibonacci number at a given
// index.

// Write a recursive method that checks if a given string is a palindrome (a
// word or phrase that is spelled the same forwards and backwards).

// Write a recursive method that calculates the factorial of a given number
// using a different approach than the one shown in the previous example.