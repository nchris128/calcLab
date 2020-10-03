public class Calculator implements CalcOp{

    @Override
    public float add(int x, int y) {
        return x + y;
    }

    @Override
    public float subtract(int x, int y) {
        return x - y;
    }

    @Override
    public float multiply(int x, int y) {
        return x * y;
    }

    @Override
    public float divide(int x, int y) {
        return x / y;
    }

}
