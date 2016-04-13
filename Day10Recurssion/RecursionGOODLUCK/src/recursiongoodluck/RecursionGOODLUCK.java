
package recursiongoodluck;


public class RecursionGOODLUCK {
    
    public static int Summation(int n) {
        // Base Case
        if (n <= 0) {
            return 0;
        // Recursive Case
        } else {
            return n + Summation(n-1);
        }
    }
    
    public static int Factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    
    public static int exponentiation(int n, int p) {
        if(p <= 0) {
            return 1;
        } else {
            return n * exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(4));
        System.out.println(Factorial(2));
        System.out.println(exponentiation(5, 6));

    }
    
}
