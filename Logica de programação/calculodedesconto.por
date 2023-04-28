programa {
  funcao inicio() {
    real valorProduto

    escreva("Digite o valor do produto: ")
    leia(valorProduto)

    se(valorProduto > 50){
      escreva(valorProduto * 0.90)
    }senao(){
      escreva("Não há desconto para este produto")
    }
  }
}
