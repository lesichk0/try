package Part4.Task_5;

public class Calculator {
    public int calculatePower(int num, int power) {
        return switch (power) {
            case 2 -> calculateSquare(num);
            case 3 -> calculateCube(num);
            default -> calculate(num, power);
        };
    }

    public int calculateSquare(int num) {
        return num * num;
    }
    public int calculateCube(int num) {
        return num * num * num;
    }
    public int calculate (int num, int x){
        return (int) Math.pow(num, x);
    }
}
