# ProjectEuler
Project Euler is a series of challenging mathematical/computer programming problems that will require more than just mathematical insights to solve. Although mathematics will help you arrive at elegant and efficient methods, the use of a computer and programming skills will be required to solve most problems.

Problem 13 tackles the large-number addition problem by summing a series of 50-digit numbers. The numbers are stored as strings to avoid precision issues in Java, and the BigInteger class is utilized for accurate arithmetic operations. The program provides a method to extract the first 10 digits of the sum, addressing the specified Euler Project challenge. The modular structure allows easy extension for similar numerical challenges.
Key Components
numbers()

    Returns an array of 50-digit numbers as strings, separated by newline characters.

Sum(String[] array)

    Computes the sum of the provided array of large numbers using BigInteger.
    Returns the first 10 digits of the resulting sum.

main(String[] args)

    Invokes the numbers() method to obtain the array.
    Calculates and prints the first 10 digits of the sum using the Sum method.

Usage

The program can be executed to obtain the solution to the Euler Project challenge involving the sum of large numbers. The modular design facilitates adaptation for similar tasks involving large numerical operations.


Problem 17 focuses on counting the number of letters used to write out the numbers from 1 to 1000 in words. The program utilizes a method, countWords(int number), which converts numeric values into their English word representations. The main method then iterates through the numbers, calculates the total number of letters, and prints the result.
Key Components
countWords(int number)

    Converts a numeric value into its English word representation.
    Utilizes arrays for one-digit numbers (ones1_19), tens (tens20_90), and processes hundreds and thousands.
    Returns the English word representation as a string.

main(String[] args)

    Initializes a variable totalLetters to track the cumulative count of letters.
    Iterates through numbers from 1 to 1000 using a for loop.
    Calls countWords for each number and updates the total letter count.
    Prints the total letter count.

Usage

Execute the main method to obtain the total number of letters used to write out numbers from 1 to 1000 in English words. The project provides a compact and efficient solution to the specified numerical challenge, with the modular design enabling reuse or extension for similar tasks involving English word representations of numbers.


Problem 20 focuses on calculating the sum of the digits in the factorial of 100. The program utilizes the BigInteger class to handle large factorials and proceeds to extract and sum the individual digits of the result. The modular design allows for easy adaptation to similar factorial-related challenges.
Key Components
main(String[] args)

    Initializes an integer n to 100.
    Computes the factorial of n using a for loop and the BigInteger class.
    Iterates through the digits of the factorial, summing them up.
    Prints the final sum.

Usage

Execute the main method to obtain the sum of the digits in the factorial of 100. The project provides an efficient solution to the specified numerical challenge, with the modular structure allowing for reuse or extension for similar tasks involving factorials and digit manipulation.


Problem 25 focuses on finding the index of the first Fibonacci number with 1000 digits. The program utilizes the BigInteger class to handle large numbers efficiently and implements a loop to generate Fibonacci numbers until the desired length is achieved. The modular design allows for easy extension or adaptation to similar challenges involving Fibonacci sequences.
Key Components
main(String[] args)

    Initializes curr and prev as BigInteger.ONE to represent the current and previous Fibonacci numbers.
    Utilizes a while loop to generate Fibonacci numbers until the length of curr reaches 1000 digits.
    Tracks the index of the Fibonacci numbers using the index variable.
    Prints the index of the first Fibonacci number with 1000 digits.

Usage

Execute the main method to find the index of the first Fibonacci number with 1000 digits. The project provides an efficient solution to the specified numerical challenge, with the modular structure allowing for reuse or extension for similar tasks involving Fibonacci sequences or digit counting.


Problem 26 focuses on finding the value of d (less than 1000) for which the reciprocal cycle of 1/d has the longest recurring cycle. The program utilizes a method, getCycleLength(int d), to calculate the length of the recurring cycle for each candidate d. The main method iterates through the values of d and identifies the one with the maximum recurring cycle length.
Key Components
main(String[] args)

    Initializes maxLength and d to track the maximum cycle length and its corresponding d.
    Iterates through values of d from 2 to 999.
    Calls getCycleLength to determine the cycle length for each d.
    Updates maxLength and d if a longer cycle is found.
    Prints the value of d with the longest recurring cycle.

getCycleLength(int d)

    Calculates the length of the recurring cycle for the reciprocal of d.
    Utilizes an array (remainders) to track the position of each remainder in the division process.
    Returns the length of the recurring cycle.

Usage

Execute the main method to find the value of d (less than 1000) with the longest recurring cycle in the reciprocal. The project provides an efficient solution to the specified numerical challenge, with the modular structure allowing for reuse or extension for similar tasks involving recurring cycles in mathematical operations.
