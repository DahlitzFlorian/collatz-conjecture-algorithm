"""Collatz-Conjecture

    Provides a solution for the 'Collatz-Conjecture'-problem
    written in Python.
"""
def collatz_conjecture(number, counter=0):
    if number <= 0:
        raise ValueError("n >= 1")
    elif number == 1:
        return counter
    elif number % 2 == 0:
        return collatz_conjecture(number / 2, counter + 1)
    else:
        return collatz_conjecture(number * 3 + 1, counter + 1)
