programa {
  funcao inicio() {
    //declaração de variável
    cadeia nome, genero
    inteiro idade


    //entrada de dados
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe seu gênero(M ou F): ")
    leia(genero)
    escreva("Informe sua idade: ")
    leia(idade)

    se(idade >= 65 e genero == "M" ou idade >=62 e genero == "F") escreva(nome," já está apto a se aposentar.")

    senao escreva(nome," não está apto a se aposentar.")

  }
}
