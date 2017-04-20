#include <iostream>
#include "cc_cpp.h"


int main()
{
    unsigned long long counter = CC_Cpp::collatz_conjecture(3);
    std::cout << counter << std::endl;

    return 0;
}