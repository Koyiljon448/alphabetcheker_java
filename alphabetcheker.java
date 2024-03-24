public class alphabetcheker {
    public static void main(String[] args) {
        // Assuming nextWord is given a value
        String nextWord = "example"; // Replace "example" with the actual value
        
        // Check if nextWord precedes "N" in alphabetical order
        if (nextWord.compareToIgnoreCase("N") < 0) {
            System.out.println("First half of the alphabet");
        } else {
            System.out.println("Second half of the alphabet");
        }
    }
}
