//Напишите программу для печати чисел от 10 до 1 с использованием функции рекурсии.

fun main()
{
    printNumbersRecursively(10)
}

fun printNumbersRecursively(start: Int)
{
    if (start > 0)
    {
        print(start)
        print(" ")
        printNumbersRecursively(start - 1)
    }
    else
    {
        println()
    }
}
