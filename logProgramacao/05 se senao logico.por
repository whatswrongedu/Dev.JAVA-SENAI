programa {
  funcao inicio() {
    //declaração de variaveis
    cadeia nome
    inteiro idade
    real altura

    //entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe a sua idade: ")
    leia(idade)
    escreva("Informe a sua altura: ")
    leia(altura)

    //verificar a idade e a altura
    se(idade >= 12 e altura >= 1.15)
    {
      escreva(nome," está autorizado a entrar no trem fantasma.")
    }
    senao
    {
      escreva(nome," não está autorizado a entrar no trem fantasma.")
    }
  }
}
