

public class OccurrencesOfWordinString {

    public static int countOccurrences(String input1, int input2, String input3) {
        // Ensure input1 is of length input2
        if (input1.length() != input2) {
            System.out.println("Error: input1 length does not match input2");
            return -1;
        }

        int count = 0;
        int n = input1.length();
        int m = input3.length();

        // Loop through input1 to find occurrences of input3
        for (int i = 0; i <= n - m; i++) {
            int j;
            // Check if input3 matches with substring of input1 starting at i
            for (j = 0; j < m; j++) {
                if (input1.charAt(i + j) != input3.charAt(j)) {
                    break;
                }
            }

            // If the entire input3 is found, increment the count
            if (j == m) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input1 = "aaaa";
        int input2 = input1.length(); // Example size of input1
        String input3 = "aa";

        int result = countOccurrences(input1, input2, input3);
        if (result != -1) {
            System.out.println("The string '" + input3 + "' appears " + result + " times in '" + input1 + "'.");
        }
    }
}
