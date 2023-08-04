class Programador(
    nome: String,
    cpf: String,
    salario: Double,
    val lenguaje: String
) :Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    fun AreaActuada(): String {
        if (lenguaje.equals("Mobile")){
            return "Area 5"
        }
        else if (lenguaje.equals("Web")){
            return "Area 9"
        }else return "Area 1"
    }
}