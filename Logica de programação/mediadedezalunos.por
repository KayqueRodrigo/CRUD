programa {
  funcao inicio() {
    cadeia aluno
    real nota1, nota2, media

    para(inteiro i = 0; i < 10; i++){

      escreva("Informe o nome do aluno:")
      leia(aluno)
      escreva("Primeira nota: ")
      leia(nota1)
      escreva("Segunda nota: ")
      leia(nota2)

      media = (nota1 + nota2) / 2

      escreva("A media do aluno: ", aluno, " é ", media, "\n")
    }
  }
}
