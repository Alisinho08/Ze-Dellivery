package Metodos;

import java.io.IOException;

import Elementos.Elementos;
import Pages.Pages;

public class Metodos extends Pages {
	Elementos e = new Elementos();

	public void navegador(String site, String navegador, String passo) throws IOException, InterruptedException {
		executarNavegador(site, navegador, passo);
		pauser(5000, "pausa");

	}

	public void login() throws IOException, InterruptedException {
		pauser(5000, "pausa");
		clicar(e.getBtnEntrar(), "Selecionando Botao Entrar");
		pauser(3000, "pausa");
		escrever(e.getCampoEmail(), "aliissonbs09@gmail.com", "Email");
		escrever(e.getSenha(), "Silv@2020", "Senha");
		clicar(e.getBtnEntrar1(), "SIm");
		pauser(5000, "pausa");
		clicar(e.getIdade18(), "Maior de  18 ?");

	}

	public void pesquisarMarca() throws IOException, InterruptedException {
		pauser(5000, "pausa");
		escrever(e.getCampoPesquisa(), "Skol 269", "Pesquisando produto");
		pauser(3000, "pausa");
		clicar(e.getProduto(), "Selecionando produto");
	}

	public void quantidade() throws IOException, InterruptedException {
		pauser(3000, "pausa");
		clicar(e.getQuantidade(), "Selecionando quantidade");
		clicar(e.getBtnAdicionar(), "Selecionando botao adicionar");

	}

	public void adicionarCompra() throws IOException, InterruptedException {
		pauser(5000, "pausa");
		clicar(e.getAddConta(), "Adicionar compra");
		//clicar(e.getSacola(), "Sacola");
	}

	public void formaPg() throws IOException, InterruptedException {
		pauser(5000, "pausa");
		clicar(e.getBtnSelecionaFormaPagamento(), "Forma de pagamento");
		
	}
	
	public void dinheiro() throws IOException, InterruptedException {
		pauser(5000, "pausa");
		clicar(e.getDinheiro(), "Dinheiro");
		pauser(5000, "pausa");
		clicar(e.getCheckboxTroco(), "Não preciso de troco");
	}
	
	public void finalizarCompra() throws IOException {
		clicar(e.getBtnFinalizarCompra(), "Finalizar Compra");
		
	}
	public void ValidarBtnDesfazerPedido() throws IOException, InterruptedException {
		pauser(3000, "pausa");
		clicar(e.getBtnDesfazerPedido(), "Desfazer pedido");
		fecharBrowser("fechar navegador");
		
		
		
	}
}
