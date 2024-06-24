package Part4.Task_8;

public class Processor {
    private final Calculator calculator;
    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }
    public int process(int x, int y) {
        calculator.setValues(x, y);
        return calculator.add();
    }
}
