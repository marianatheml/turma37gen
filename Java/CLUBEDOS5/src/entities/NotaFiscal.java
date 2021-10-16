package entities;

public class NotaFiscal {
	
	public String notaFiscal (double valorTotal, double imposto, char op, double pagamento) {
		String modoPagamento = "";
		if (op=='1') {
			modoPagamento = "\nO pagamento teve um desconto de 10%.\nVALOR FINAL DA COMPRA: R$  ";
		} else if (op=='2') {
			modoPagamento = "\nO pagamento teve um aumento de 10%.\nVALOR FINAL DA COMPRA: R$   ";
		} else if (op == '3') {
			modoPagamento = "\nO pagamento teve um aumento de 15%.\nVALOR FINAL DA PARCELA: R$  ";
		}
		return "\t\tNOTA FISCAL\n" + "VALOR DA COMPRA: " + valorTotal + "\nVALOR IMPOSTO: " + imposto + "\n" + modoPagamento + String.format("%.2f", pagamento);
	}

}
