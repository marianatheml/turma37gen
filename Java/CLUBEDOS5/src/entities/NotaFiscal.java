package entities;

public class NotaFiscal {
	
	public String notaFiscal (double valorTotal, double imposto, char op, double taxas) {
		
		String tipoPagamento = "";
		
		if (op == '1') {
			tipoPagamento = "\nTIPO DE PAGAMENTO: A VISTA\nTAXA: 10% DE DESCONTO\nVALOR FINAL DA COMPRA: R$ ";
		} else if (op == '2') {
			tipoPagamento = "\nTIPO DE PAGAMENTO: CARTÃO\nTAXA: 10% DE AUMENTO\nVALOR FINAL DA COMPRA: R$ ";
		} else if (op == '3') {
			tipoPagamento = "\nTIPO DE PAGAMENTO: PARCELADO EM 2 VEZES\nTAXA: 15% DE AUMENTO\nO VALOR DE CADA PARCELA: R$ "+ String.format("%.2f", (taxas/2)) + "\nVALOR FINAL DA COMPRA: R$ ";
		}
		return    "--------------------------------------------\n"
				+ "\t\tNOTA FISCAL\n"
				+ "--------------------------------------------\n" 
				+ "Clube Dos 5 LTDA\n"
				+ "CNPJ: 95.3656.008/0001-45\n"
				+ "Rua Generation Brasil, 37        Recife - PE\n"
				+ "--------------------------------------------\n"
				+ "VALOR DO PRODUTO: R$" + String.format("%.2f", valorTotal)
				+ "\nVALOR IMPOSTO: R$" + String.format("%.2f", imposto)
				+ tipoPagamento + String.format("%.2f", taxas)
				+ "\n------------------------------------------\n" 
				+ "║█║▌║█║▌│║▌█║▌║█║▌║█║▌│║▌█║▌║█║▌║█║▌│║▌█║▌\n"
				+ "325256456 5646 456 456456456 4564564522252\n"
				+"\n\t   COMPRA FINALIZADA\n\n";
		
	}

}
