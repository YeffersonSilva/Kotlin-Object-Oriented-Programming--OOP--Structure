import kotlin.time.times

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,

) {
    fun bonificacion(): Double {
        return salario * 0.1
    }


}