package Part3.Task_4;

public class Task {
    public void searchElement(int[] array, int target) {
        for (int j : array) {
            if (j == target) {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }
}
