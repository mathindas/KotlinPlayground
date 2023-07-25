fun main() {
    val player1 = SoccerPlayer("Andi", 20)
    val player2 = SoccerPlayer("Budi", 19)
    val player3 = SoccerPlayer("Doni", 17)

    val myTeam = SoccerTeam(listOf(player1, player2, player3))

    myTeam.play()
}

interface Kickable {
    fun kick()
}

open class SoccerPlayer(val name: String, val age: Int) : Kickable {
    override fun kick() {
        println("$name, nice kick")
    }
}

class SoccerTeam<T>(players: List<T>) where T : SoccerPlayer, T : Kickable {
    private val validPlayers: List<T> = players.filter { it.age >= 18 }

    fun play() {
        if (validPlayers.isEmpty()) {
            println("This soccer team does not have players who are 18 years old and above.")
        } else {
            println("This soccer team is playing:")
            for (player in validPlayers) {
                player.kick()
            }
        }
    }
}
