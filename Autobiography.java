public class Autobiography {
    public static void main(String[] args) {
        String n = "1210";
        System.out.println(isAutoBiography(n));
    }

    public static boolean isAutoBiography(String n) {
        for (int i = 0; i < n.length(); i++) {
            int expectedCount = n.charAt(i) - '0'; 
            int actualCount = 0;
            for (int j = 0; j < n.length(); j++) {
                if ((n.charAt(j) - '0') == i) { 
                    actualCount++;
                }
            }
            if (expectedCount != actualCount) {
                return false;
            }
        }
        return true;
    }
}
