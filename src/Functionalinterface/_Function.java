package Functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes 1 argument and produces 1 result
        int increment=increment(1);
        System.out.println(increment);

        int increment2=incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiplyBy10 = multiplyBy10Function.apply(increment2);
        System.out.println(multiplyBy10);

        Function<Integer,Integer> incrementBy1andThenMultiplyBy10=
                incrementByOneFunction
                        .andThen(multiplyBy10Function);

        System.out.println(incrementBy1andThenMultiplyBy10.apply(1));

        //BiFunction takes 2 arguments and produces 1 result

        System.out.println(numberToIncrementBy1AndMultiply.apply(4,100));
    }
    static Function<Integer,Integer> incrementByOneFunction=
            number->number+1;
    static Function<Integer,Integer> multiplyBy10Function =
            number->number*10;
    static int increment(int number){
        return number+1;
    }
    static int incrementBy1AndMultiply(int number,int numToMultiplyBy){
        return (number+1)* numToMultiplyBy;
    }
    static BiFunction<Integer,Integer,Integer> numberToIncrementBy1AndMultiply=
            (numberToIncrementBy1,numberToMultiplyBy)
                    -> (numberToIncrementBy1+1) *numberToMultiplyBy;

}
