public class CountWords {
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java programming.";
        String[] words = str.split("\\s+");
        System.out.println("Number of words in the string: " + words.length);
    }
}
