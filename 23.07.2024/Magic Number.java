public class MagicNumber {
    public static void main(String[] args) {
        int number = 1234;
        int sum = number;

        while (sum > 9) {
            sum = sumDigits(sum);
        }

        if (sum == 1) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
