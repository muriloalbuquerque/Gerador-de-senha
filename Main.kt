// -----  GERADOR DE SENHAS(BASICO) -----

fun main() {
    // Pesquise como ler a entrada do usuário (readln)
    // Pergunte ao usuário quantos caracteres a senha deve ter
    println("Quantos caracteres a senha deve ter?")
    val tamanho = readln()?.toIntOrNull()

    if (tamanho != null) {

        val senhaGerada = gerarSenha((tamanho))
        println("Senha gerada: $senhaGerada")
    } else {
        println("Valor invalido, Digite um número inteiro.")
    }

}
// Pesquise como criar uma função para gerar a senha
// A função deve receber o tamanho da senha e retornar uma string aleatória


fun gerarSenha(tamanho: Int): String {
    val caracteresPermitidos =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:',.<>?/`~"
    val senha = StringBuilder()
    for (i in 1..tamanho) {


        // Pesquise como gerar caracteres aleatórios em Kotlin
        val charaleatorio = caracteresPermitidos.random()
        senha.append(charaleatorio)

        // Letras maiúsculas, minúsculas e números
        //val caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:',.<>?/`~"

        // Pesquise como transformar uma lista de caracteres em uma string
    }
        // Mostre a senha gerada para o usuário
        return senha.toString()

}