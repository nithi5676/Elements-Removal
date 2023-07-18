package elementsRemoval;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElementsRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements:");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Collections.reverse(Arrays.asList(array));
        scanner.close();
        System.out.println(removal(array));
    }

    private static int removal(int array[]) {
        int minCost = 0;
        for (int i = 0; i < array.length; i++) {
            minCost += (array[i] * (i + 1));
        }
        return minCost;

    }

}
