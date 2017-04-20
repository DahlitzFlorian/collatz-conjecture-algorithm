<?php 
/*
    Provides a solution for the 'Collatz-Conjecture'-problem
    written in PHP.
 */
class CC_PHP {
    public static function collatz_conjecture($number, $counter = 0) 
    {
        if($number <= 0)
            throw ValueException("$number > 0");
        else if($number == 1)
            return $counter;
        else if($number % 2 == 0)
            return self::collatz_conjecture($number / 2, $counter + 1);
        else
            return self::collatz_conjecture($number * 3 + 1, $counter + 1);
    }
}