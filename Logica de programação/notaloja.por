programa {
  funcao inicio() {
    inteiro idade, contador
    caracter nota

    escreva("Qual � sua idade: ")
    leia(idade)
    escreva("Qual a nota voc� da para a nossa loja: ")
    escreva("A -> �timo")
    escreva("B -> Bom")
    escreva("C -> Regular")
    escreva("D -> Ruim")
    escreva("E -> P�ssimo")

    leia(nota)


    escolha(nota){
      caso a:
      escreva("Obrigado pela sua avalia��o")
      a += a
      pare
      caso b
      escreva("Obrigado pela sua avalia��o")
      b += b
      pare 
      caso c
      escreva("Obrigado pela sua avalia��o")
      c += c
      pare
      caso d
      escreva("Obrigado pela sua avalia��o")
      d +=d
      pare
      caso e
      escreva("Obrigado pela sua avalia��o")
      e +=e
      pare

    }

  


  }
}
