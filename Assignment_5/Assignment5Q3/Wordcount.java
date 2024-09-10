public class Wordcount {
    public static void main(String[] args) {
        String input = "          Hello, t     ";        
        input = input.trim();
        if (input.isEmpty()) {
            System.out.println("The number of words is: 0");
        } else {
            String[] words = input.split(" ");
            System.out.println("The number of words is: " + words.length);
        }
    }
}
