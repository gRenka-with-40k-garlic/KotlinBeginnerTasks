//Напишите программу для различения значений val и var.

fun main()
{
    val immutableVariable = "Неизменяемая строка"
    // Попытка изменить значение неизменяемой переменной приведет к ошибке

    var mutableVariable = "Изменяемая строка"
    mutableVariable = "Новое значение"

    println("Неизменяемая переменная: $immutableVariable")
    println("Изменяемая переменная: $mutableVariable")
}