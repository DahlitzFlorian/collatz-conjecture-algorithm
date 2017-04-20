/*
    Provides a solution for the 'Collatz-Conjecture'-problem
    written in JavaScript.
 */
var collatz_conjecture = function(number, counter=0) {
    if(number <= 0) {
        throw RangeError("number >= 1");
    }
    else if(number === 1) {
        return counter;
    }
    else if(number % 2 === 0) {
        return collatz_conjecture(number / 2, counter + 1);
    }    
    else {
        return collatz_conjecture(number * 3 + 1, counter + 1);
    }
};