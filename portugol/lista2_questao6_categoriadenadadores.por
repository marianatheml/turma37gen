programa
{
	
	funcao inicio()
	{
		
		inteiro idade

		escreva("Digite a sua idade : ")
		leia(idade)

		escreva("Categoria: ")

		se(idade>=18){
			escreva("Adultos")
		}
		senao se (idade>=14){ 
			escreva("Juvenil B")
		}
		senao se (idade>=12){
			escreva("Juvenil A")
		}
		senao se (idade>=8){
			escreva("Infantil B")
		}
		senao se (idade>=5){
			escreva("Infantil A")
		}
		senao{
			escreva("Invalida\n\nApenas nadadores acima de 5 anos!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */