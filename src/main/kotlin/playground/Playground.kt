package playground
import kotlin.random.Random

val input = mutableListOf("Kolya","15") // Перший аргумент ваш нік,другий аргумент число яке ви загадали
private fun readLine(): String? {
    val line = input.firstOrNull()
    input.removeAt(0)
    return line
}

fun main(args: Array<String>) {
    println("Input nickname : ")
    val player = readLine()

    val newPlayer = player?.capitalize()
    println("Hello $newPlayer \n I already guessed the number) \n guess the number: ")
    val a = readLine()?.toInt()
    var i = 0
    while (i != a) {
        i++
    }
    println("Here is the number you guessed $a \n now it's my turn to guess the number ")
    val botRandom = Random.nextInt(0, 100)
    i = 0
    while (i != botRandom) {
        i++
    }
    println("$newPlayer : I think you number is $botRandom \n cool you guessed my number!")
}
