//Напиши программу на Kotlin для создания массива размером 10, содержащий: 0 2 4 6 8 10 12 14 16 18

fun main()
{
    val array = Array(10) { index -> index * 2 }

    for (element in array)
    {
        println(element)
    }
}
