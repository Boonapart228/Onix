import kotlin.random.Random

fun main() {
    var povtor: Int
    do {
        var player: String
        println("Input nickname : ")
        player = readln()
        val newPlayer = player.capitalize()
        println("Hello $newPlayer")
        val botRandom = Random.nextInt(0, 100)
        var searchRandom: Int

        do {
            println("Enter a number : ")
            searchRandom = readln().toInt()
            if (searchRandom > botRandom) {
                println("A number more than I came up with")
            } else if (searchRandom < botRandom) {
                println("The number is less than I came up with")
            }
        } while (botRandom != searchRandom);
        println("Good work $newPlayer")

        println("Now, i can start search you number) my name is Akinator")


        println("$newPlayer guess the number")
        readln()

        var botSearch = Random.nextInt(0, 100)

        var Hint: Int
        println(botSearch)
        do {
            println("Hmmm i think the number is $botSearch")
            println("it's troo?)")
            println("1 - The number is small \n 2 - a little more \n 3 - you almost guessed but more \n 4 - The number is less \n 5 - a little less \n 6 - you almost guessed but less \n 7 - Well done, you guessed it  ")
            Hint = readln().toInt()
            when (Hint) {
                1 -> {
                    botSearch += 10
                }
                2 -> {
                    botSearch += 5
                }
                3 -> {
                    botSearch += 1
                }
                4 -> {
                    botSearch -= 10
                }
                5 -> {
                    botSearch -= 5
                }
                6 -> {
                    botSearch -= 1
                }
            }


        } while (Hint != 7)
        println("Akinator : hey $newPlayer do you want to play again? ")
        println("1 - yes || 2 - no ")
        povtor = readln().toInt()

    } while (povtor != 2)

}