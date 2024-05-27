// Напишите программу на Kotlin, чтобы заменить is на was соответственно в заданной строке. He is cryling ver loud.

fun main()
{
    val input = "He is cryling very loud."
    val output = input.replace("is", "was")
    println(output)
}