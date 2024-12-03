fun main() {
    println("Digite o Seu Nome")
    val studentName = readLine()
    println("Digite o Sua Escola")
    val studentSchool = readLine()
    println("Agora Digite Sua Média")
    val studentAverage = readLine()!!.toFloat()

    if (studentName != null) {
        if (studentSchool != null) {
            calculateAverage(studentName, studentSchool, studentAverage)
        }
    }
}

fun calculateAverage(studentName: String, studentSchool: String, studentAverage: Float) {
    val averageStatus: AverageStatus
    if (studentAverage >= 7) {
        averageStatus = AverageStatus.APROVADO
    } else if (studentAverage >= 4) {
        averageStatus = AverageStatus.RECUPERACAO
    } else {
        averageStatus = AverageStatus.REPROVADO
    }

    println("Nome: $studentName")
    println("Escola: $studentSchool")
    println("Media: $studentAverage")
    println("Situacao: $averageStatus")
}

enum class AverageStatus {
    APROVADO, REPROVADO, RECUPERACAO
}