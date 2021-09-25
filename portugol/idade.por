programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNascimento,idade

		escreva("Digite o nome da pessoa : ")
		leia(nome)
		escreva("Digite o ano de nascimento : ")
		leia(anoNascimento)

		idade = (2021-anoNascimento)

		escreva(nome,", a sua idade aproximada é ",idade, " anos!\n")

		se(idade>=22){
			escreva("ihhh, você é cringe!")
		}

		senao se (idade>=13){ 
			escreva("Parabéns, você é jovem!")
		}
		senao se (idade>=4){
			escreva("Você é criança!")
		}
		senao se (idade<0){
			escreva("Onti, você é um nenem!")
		}
		senao{
			escreva("Você informou um ano de nascimento incorredo!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */