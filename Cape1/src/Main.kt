import kotlin.random.Random

fun main() {
    println("Selamat datang di permainan Roulette!")
    print("Masukkan nama Anda: ")
    val playerName = readLine() ?: "Pemain"

    println("Halo, $playerName! Pilih nomor antara 0 hingga 36 (ketik 'EXIT' untuk keluar):")

    while (true) {
        val input = readLine()
        if (input == "EXIT") {
            println("Terima kasih telah bermain, $playerName!")
            break
        }

        val playerNumber = input?.toIntOrNull()
        if (playerNumber == null || playerNumber < 0 || playerNumber > 36) {
            println("Nomor tidak valid. Silakan pilih nomor antara 0 hingga 36.")
            continue
        }
        val winningNumber = Random.nextInt(0, 37)
        println("Nomor yang keluar adalah: $winningNumber")

        if (playerNumber == winningNumber) {
            println("Selamat, $playerName! Anda menang!")
        } else {
            println("Sayang sekali, $playerName. Anda kalah dan anda kurang beruntung. Coba lagi!")
        }
    }
}