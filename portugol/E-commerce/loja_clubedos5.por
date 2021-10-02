programa
{
	inclua biblioteca Matematica -->mat
	inclua biblioteca Texto -->tx
		cadeia nomeLoja = "CLUBE DOS 5", slogan = "Vista seu TIME! Use sua PAIXÃO!",fundadores = "* * * * *"
		cadeia cod[10] = {"G8-1", "G8-2", "G8-3", "G8-4", "G8-5", "G8-6", "G8-7", "G8-8", "G8-9", "G8-10"}  
		cadeia produto[10] = {"CAMISA DO SANTA-CRUZ", "CAMISA DO NÁUTICO", "CAMISA DO SPORT CLUB", "CAMISA DO REAL MADRID", "CAMISA DO BARCELONA", "CAMISA DO BOCA JUNIORS", "CAMISA DO JUVENTUS", "CAMISA DO MANCHESTER U.", "CAMISA DO BOCA JUNIORS", "CAMISA DO LIVERPOOL"}
		real valor[10] = {180.00, 150.00, 175.00, 199.00, 199.00, 180.00, 202.00, 199.00, 180.00, 202.00}
		inteiro estoque[10] = {10,10,10,10,10,10,10,10,10,10}, carrinho[10] = {0,0,0,0,0,0,0,0,0,0}
		
		cadeia op ="",cont="S"
		inteiro quantidade=0,codUsuario,pagamento
		real imposto=0.09,desconto=0.10,cartao=0.10,aPrazo=0.15,parcelas
		real valorTotal,compras = 0.0,valorFinal,valorImposto
		
	funcao inicio()
	{
		faca{
			pagamento = 0
			valorImposto = 0.0
			valorFinal = 0.0
			valorTotal = 0.0
			para(inteiro x=0;x<10;x++){
				carrinho[x] = 0
			}
			limpa()
			loja()
			escreva("\nDeseja realizar uma compra S/N: ")
			leia(op)
			op = tx.caixa_alta(op)

			se (op == "S"){
				limpa()
				loja()

				faca { 
					menu()
					
					faca {
						escreva("\nSelecione o Código de 1 a 10 relacionado ao produto para adcionar no carrinho: ")
						leia(codUsuario)
						codUsuario--
						
						se (codUsuario<0){
							escreva("Código não encontrado, digite novamente!")
						}
						
					}enquanto (codUsuario<0 ou codUsuario>10)
					// Aqui ele irá realizar a mesma pergunta enquanto o valor não for válido
					
					faca{	
						escreva("Digite a quantidade que você deseja: ")
						leia(quantidade)
						
						se (quantidade<=0){
							escreva("Quantidade inexistente, digite um valor válido.\n")
						}senao se (quantidade>estoque[codUsuario]){
							escreva("Quantidade indisponível no estoque, deste produto restam apenas ",estoque[codUsuario]," unidades na loja. Tente novamente.\n")
						}
						
						compras = valor[codUsuario]*quantidade //colocar em compra parcial (valor do produto x quantidade)
						valorTotal+=compras //contabilizar o valor total (soma de todos os valores parciais)
						
						carrinho[codUsuario] = quantidade
					}enquanto (quantidade<=0 ou quantidade>estoque[codUsuario])
					// Aqui temos definido que se o valor digitado do estoque for negativo, ele da como inválido
					// se ele for maior do que temos em estoque, dará valor indisponível e o número que tem em estoque
					// e se estiver dentro do permitido, irá contabilizar o valor da compra.

					
					escreva("\n")
					loja()
					escreva("\nCARRINHO DE COMPRA\n")
					
					para(inteiro x=0;x<10;x++){
						se(carrinho[x]!=0){
						escreva(cod[x],"\t",produto[x],"\t\t",valor[x],"\t\t",estoque[x]," -	Quantidade selecionada: ",carrinho[x],"\n")
						}
					} //mostrar o que foi comprado até agora
					
					escreva("\nVocê quer adicionar mais produtos [S/N]: ")
					leia(op)
					op = tx.caixa_alta(op)
				
				}enquanto(op=="S")
				
				para(inteiro x=0;x<10;x++){
					se(carrinho[x]!=0){
						estoque[x] = estoque[x] - carrinho[x]
					} // Tirando aqui a quantidade comprada pelo cliente do nosso estoque
				}
				
				valorImposto = mat.arredondar((valorTotal * imposto),2)
				valorTotal = valorTotal + valorImposto //Adicionando o imposto na compra
				
				faca{
					escreva("\nQual a forma de pagamento que o(a) senhor(a) deseja realizar: ")
					escreva("\n[1] à vista (10% de desconto)")
					escreva("\n[2] no cartão (10% de juros)")
					escreva("\n[3] dividido em 2 vezes (15% de juros)")
					escreva("\nDigite o código correspondente: ")
					leia(pagamento)
					escolha (pagamento){
						caso 1:
							escreva("\nÓtima escolha, à vista iremos lhe dar um desconto de 10%.\n")
							valorFinal = mat.arredondar((valorTotal - (valorTotal*desconto)),2)
							pare
						caso 2:
							escreva("\nÓtimo, iremos apenas acrescentar 10% de juros no valor final.\n")
							valorFinal = mat.arredondar((valorTotal + (valorTotal*cartao)),2)
							pare
						caso 3:
							escreva("\nÓtimo, iremos apenas acrescentar 15% de juros no valor final.\n")
							valorFinal = mat.arredondar((valorTotal + (valorTotal*aPrazo)),2)
							parcelas = mat.arredondar((valorFinal / 2),2)
							pare
						caso contrario:
							escreva("\nVocê digitou um número inválido, digite novamente.\n")
					}
				}enquanto(pagamento<1 ou pagamento>3) //perguntar a forma de pagamento até o usuário digitar um valor válido
			
			
				escreva("\n\t\t\tNOTA FISCAL\n") //mostrando nota fiscal ao cliente
				escreva("************************************************************\n")
				escreva("LOJA: ",nomeLoja,"\n")
				escreva("Valor do seu pedido			-	 R$",valorTotal,"\n")
				escreva("Valor do imposto embutido		-	 R$",valorImposto,"\n")
				se (pagamento==3){
					escreva("Valor Final (forma de pagamento)\t-	 R$",valorFinal,"\n")
					escreva("Valor de cada parcela (2x)	 \t-	 R$",parcelas,"\n")
				}senao
				{
					escreva("Valor Final (forma de pagamento)\t-	 R$",valorFinal,"\n")
				}
			}senao se (op == "N"){
				limpa()
				loja()
			}
		escreva("\nDeseja continuar S/N: ")
		leia(cont)
		cont = tx.caixa_alta(cont)
		}enquanto(cont=="S")
		
		escreva("\nObrigado pela presença, nós da ",nomeLoja," agradecemos a preferência.\n")
		escreva(slogan," Volte sempre!\n")
	}
	
	funcao loja(){
		escreva(nomeLoja,"\t ",fundadores)
		escreva("\n",slogan,"\n")
	}

	funcao menu(){
		escreva("\nCÓDIGO\t\tPRODUTO\t\t\tVALOR\t      ESTOQUE\n")
			para(inteiro x=0;x<10;x++){
					escreva(cod[x],"\t",produto[x],"\t\t",valor[x],"\t\t",estoque[x],"\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */