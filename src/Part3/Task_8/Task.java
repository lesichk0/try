package Part3.Task_8;

public class Task {
    public double calculateAverage(int[] numbers) {
        assert numbers != null && numbers.length > 0 : "Array 'numbers' must not be null or empty";

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        assert numbers.length != 0 : "Array 'numbers' must not be empty";

        return (double) sum / numbers.length;
    }

    public double calculateAverage2(int[] numbers) {
        int sum = 0;

        if (numbers.length > 0) {
            for (int number : numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        } else {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }
}
