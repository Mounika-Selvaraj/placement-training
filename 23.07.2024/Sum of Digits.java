public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Sum of digits of " + number + " is: " + findSumOfDigits(number));
    }

    public static int findSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
