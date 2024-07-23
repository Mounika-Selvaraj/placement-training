public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + findFactorial(number));
    }

    public static int findFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * findFactorial(num - 1);
    }
}
