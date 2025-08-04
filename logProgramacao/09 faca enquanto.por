programa {
  funcao inicio() {
    //declaração de variáveis
    inteiro opcao
    real x, y, result


    //loop faca enquanto
    faca
    {
    escreva("\n1 - Soma\n")
    escreva("2 - Subtração\n")
    escreva("3 - Multiplicação\n")
    escreva("4 - Divisão\n")
    escreva("5 - Sair do programa\n")
    leia(opcao)
  
    //entrada de dados
    se(opcao >= 1 e opcao <= 4)
    {
    escreva("Informe o valor de x: ")
    leia(x)
    escreva("Informe o valor de y: ")
    leia(y)
    }


    //escolha caso
    escolha(opcao)
    {
      caso 1:
        result = x+y
        escreva("O resultado é ", result)
      pare
      caso 2:
        result = x-y
        escreva("O resultado é ", result)
      pare
      caso 3:
        result = x*y
        escreva("O resultado é ", result)
      pare
      caso 4:
        result = x/y
        escreva("O resultado é ", result)
      pare
      caso 4:
        result = x/y
        escreva("O resultado é ", result)
      pare
      caso 5:
        escreva("Programa encerrado.")
      pare
      caso contrario:
      escreva("Opção inválida")
    }

    }enquanto(opcao != 5)
  }
}
