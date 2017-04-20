#include <stdexcept>
/*
    Provides a solution for the 'Collatz-Conjecture'-problem
    written in C++.
 */
class CC_Cpp {
    static unsigned long long collatz_conjecture(unsigned long long number, unsigned long long counter = 0)
    {
        if(number <= 0)
            throw std::invalid_argument("number > 0");
        else if(number == 1)
            return counter;
        else if(number % 2 == 0)
            return collatz_conjecture(number / 2, counter + 1);
        else
            return collatz_conjecture(number * 3 + 1, counter + 1);
    }
}