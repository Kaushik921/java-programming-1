

public class Generic {

    public static <T> void genericNumber(T num) throws NumException{
        if (num instanceof Number)
            System.out.println(multiply((Number) num, (double)2/3));
        else
            throw new NumException();
    }

    public static <T extends Number> double multiply(T a, Double b){
        if (a instanceof Float || a instanceof Double){
            return a.doubleValue() * b;
        }
        return a.longValue() * b;
    }

    public static void main(String[] args) throws NumException {
        genericNumber(23);
        genericNumber("dsas");
    }
}

class NumException extends Exception{
    public NumException() {
        super("Don't pass a string here!!");
    }
}
