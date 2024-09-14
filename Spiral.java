
public class Spiral {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rows = a.length;
        int cols = a[0].length;
        int left = 0;
        int top = 0;
        int bottom = rows - 1;
        int right = cols - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) { // Traverse from left to right
                for (int i = left; i <= right; i++) {
                    System.out.print(a[top][i] + " ");
                }
                top++;
            } else if (direction == 1) { // Traverse downwards
                for (int i = top; i <= bottom; i++) {
                    System.out.print(a[i][right] + " ");
                }
                right--;
            } else if (direction == 2) { // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            } else if (direction == 3) { // Traverse upwards
                System.err.println("top "+top+" bot "+bottom);
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
            System.out.println(" dir "+direction);
            direction = (direction + 1) % 4; // Cycle through directions 0-3
            System.out.println(" dir "+direction);
            
        }
    }
}
