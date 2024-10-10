public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            
            ans.append(carry % 2);
            carry = carry / 2;
        }
        
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String a="11";
        String b="11";
        System.out.println(addBinary(a,b));
    }
}
