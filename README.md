# ProjectEuler
Project Euler is a series of challenging mathematical/computer programming problems that will require more than just mathematical insights to solve. Although mathematics will help you arrive at elegant and efficient methods, the use of a computer and programming skills will be required to solve most problems.

Problem 13, tackles the large-number addition problem by summing a series of 50-digit numbers. The numbers are stored as strings to avoid precision issues in Java, and the BigInteger class is utilized for accurate arithmetic operations. The program provides a method to extract the first 10 digits of the sum, addressing the specified Euler Project challenge. The modular structure allows easy extension for similar numerical challenges.
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
