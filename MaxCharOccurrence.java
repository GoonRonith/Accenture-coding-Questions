public class MaxCharOccurrence {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println("Character with max occurrences: " + getMaxOccurringChar(s));
    }

    public static char getMaxOccurringChar(String s) {
        // Assuming the string contains only lowercase English letters
        int[] freq = new int[26]; // Array to store frequencies of characters 'a' to 'z'

        // Traverse the string and update the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find the character with the maximum frequency
        int maxFreq = 0;
        char maxChar = ' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'a');
            }
        }

        return maxChar;
    }
}
