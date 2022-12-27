package rs.ac.ni.pmf.oop2.lambda;

import lombok.Value;

import java.util.function.BiFunction;

@Value
public class Calc
{
    int a;
    int b;

    public int calculate(BiFunction<Integer, Integer, Integer> operator)
//    public int calculate(IntBinaryOperator operator)
    {
        return operator.apply(a, b);
    }

    public static void main(String[] args)
    {
        final Calc calc = new Calc(3, 5);
        System.out.println(calc.calculate(Integer::sum));
        System.out.println(calc.calculate((x, y) -> x * y));
        System.out.println(calc.calculate((x, y) -> x * y + x + y));
    }
}
