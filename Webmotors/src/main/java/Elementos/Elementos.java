package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	private By btnEntrar = By.id("welcome-button-sign-in");
	private By campoEmail = By.xpath("//input");
	private By senha = By.id("login-mail-input-password");
	private By btnEntrar1 = By.xpath("//button[normalize-space()='Entrar']");
	private By  idade18 = By.id("age-gate-button-yes");
	private By campoPesquisa = By.name("Pesquisar");
	private By produto = By.xpath("//*[@id=\"search-product-list-item-product-8502\"]/div");
	private By quantidade = By.id("add-amount-15");
	private By btnAdicionar = By.xpath("//*[@id=\"add-product\"]/div");
	private By addConta = By.id("finish-order");
	private By btnSelecionaFormaPagamento = By.id("finish-order");
	private By dinheiro = By.xpath("/html/body/div[1]/div/div/section/div[1]/div[2]/div/div/div/span");
	private By checkboxTroco = By.id("offline-payment-method-checkbox");
	private By btnFinalizarCompra = By.id("payment-method-button-finish-purchase");
	private By btnDesfazerPedido = By.id("checkout-modal-undo-order-button");
	private By sacola = By.xpath("//*[@id=\"bag-pre-checkout\"]/figure/img");
	
	public By getBtnEntrar() {
		return btnEntrar;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getSenha() {
		return senha;
	}
	public By getBtnEntrar1() {
		return btnEntrar1;
	}
	public By getIdade18() {
		return idade18;
	}
	public By getCampoPesquisa() {
		return campoPesquisa;
	}
	public By getProduto() {
		return produto;
	}
	public By getQuantidade() {
		return quantidade;
	}
	public By getBtnAdicionar() {
		return btnAdicionar;
	}
	public By getAddConta() {
		return addConta;
	}
	public By getBtnSelecionaFormaPagamento() {
		return btnSelecionaFormaPagamento;
	}
	public By getDinheiro() {
		return dinheiro;
	}
	public By getCheckboxTroco() {
		return checkboxTroco;
	}
	public By getBtnFinalizarCompra() {
		return btnFinalizarCompra;
	}
	public By getBtnDesfazerPedido() {
		return btnDesfazerPedido;
	}
	public By getSacola() {
		return sacola;
	}
	

}
