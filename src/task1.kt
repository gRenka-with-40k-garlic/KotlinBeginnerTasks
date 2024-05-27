// Напишите программу на Kotlin для печати простых чисел от 1 до 100.
// Простые числа до 100: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

fun main()
{
    for (i in 1..100)
    {
        if (isPrime(i))
        {
            print("$i ")
        }
    }
}

fun isPrime(number: Int): Boolean
{
    if (number <= 1) return false
    if (number == 2) return true
    if (number % 2 == 0) return false

    for (i in 3..Math.sqrt(number.toDouble()).toInt() step 2)
    {
        if (number % i == 0)
        {
            return false
        }
    }
    return true
}