public class Calculator {

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public <T extends Number> T subtract(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }
}
