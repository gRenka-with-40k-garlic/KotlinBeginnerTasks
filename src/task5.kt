//получить среднее значение по заданным элементам массива.
// среднее арифметическое значений 2.5, 1.8, 3.4 равно 2.5666666666666664

fun main()
{
    val elements = doubleArrayOf(2.5, 1.8, 3.4)
    val sum = elements.sum()
    val average = sum / elements.size
    println(average)
}