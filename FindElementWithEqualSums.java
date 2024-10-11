public class FindElementWithEqualSums {
    public static void main(String[] args) {
        int[] l = {-7,2,4,9,-8,1,6};
        int totalSum = 0;
        for (int i : l) {
            totalSum += i;
            System.out.println(totalSum+"ts");
        }

        int sumLeft = 0;
        boolean found = false;
        for (int i = 0; i < l.length; i++) {
            int sumRight = totalSum - sumLeft - l[i];

            if (sumLeft == sumRight) {
                System.out.println("Found at index " + (i + 1) + ", element -> " + l[i]);
                found = true;
                break;
            }

            sumLeft += l[i];
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}

