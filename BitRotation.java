public class BitRotation {

    // Method to perform left rotation
    public static int rotateLeft(int num, int distance,int size) {
        int a=num << distance;
        System.out.println(Integer.toBinaryString(a));
        int b=num >> (size-distance);
        System.out.println(Integer.toBinaryString(b));
        int c=(a|b);
        System.out.println(Integer.toBinaryString(c));
        return c;
    }

    // Method to perform right rotation
    public static int rotateRight(int num, int distance,int size) {
        distance = distance % size;

        return (num >> distance) | (num << (size - distance));
    }

    public static void main(String[] args) {
        int num = 229; // Example number (in decimal)
        int distance = 3; // Number of positions to rotate 
        int size=Integer.toBinaryString(num).length();
        // System.out.println(size);
        // Print the original number with 32-bit padding
        System.out.println("Original number: " + String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0'));

        // Perform left rotation and print with 32-bit padding
        int leftRotated = rotateLeft(num, distance,size);
        System.out.println("Left rotated: " + String.format("%32s", Integer.toBinaryString(leftRotated)).replace(' ', '0'));

        // Perform right rotation and print with 32-bit padding
        int rightRotated = rotateRight(num, distance,size);
        System.out.println("Right rotated: " + String.format("%32s", Integer.toBinaryString(rightRotated)).replace(' ', '0'));
    }
}
