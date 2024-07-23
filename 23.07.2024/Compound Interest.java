public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000, rate = 5, time = 10;
        double amount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = amount - principal;
        System.out.println("Compound interest: " + compoundInterest);
    }
}
