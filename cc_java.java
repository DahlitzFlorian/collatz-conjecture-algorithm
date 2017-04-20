import java.*;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class CC_Java {

    public static long collatz_conjecture(long number) {
        long counter = 0;
        
        if(number <= 0) {
            throw ValueException("number > 0");
        }
        else if(number == 1) {
            return counter;
        }
        else if(number % 2 == 0) {
            return collatz_conjecture(number / 2, counter + 1);
        }
        else {
            return collatz_conjecture(number * 3 + 1, counter + 1);
        }
    }
    
    public static long collatz_conjecture(long number, long counter) {
        if(number <= 0) {
            throw ValueException("number > 0");
        }
        else if(number == 1) {
            return counter;
        }
        else if(number % 2 == 0) {
            return collatz_conjecture(number / 2, counter + 1);
        }
        else {
            return collatz_conjecture(number * 3 + 1, counter + 1);
        }
    }
}