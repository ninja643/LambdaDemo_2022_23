package rs.ac.ni.pmf.oop2.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class LambdaDemo
{
    private final Random random = new Random();

    void printIntValue(final Supplier<Integer> supplier)
    {
        System.out.println(supplier.get());
    }

    public void doDemo()
    {
        printIntValue(() -> random.nextInt());
        printIntValue(() -> 3);
    }

    public static void main(String[] args)
    {
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.doDemo();
    }
}
