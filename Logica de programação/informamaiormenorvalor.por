programa {
  funcao inicio() {
    inteiro valor, maior = 0, menor = 0

    faca{

      escreva("Digite um valor: ")
      leia(valor)

      se(valor > maior){
         maior = valor
      }senao se(valor < menor e valor != 0){
        menor = valor
      }

    } enquanto(valor != 0)

    escreva("O maior valor informado foi: " + maior + "\n")
    escreva("O menor valor informado foi: " + menor)
  }
}
