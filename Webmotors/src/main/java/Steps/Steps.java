package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Metodos{
	
	
	
	@Given("que o usuario acesse o {string}")
	public void que_o_usuario_acesse_o(String site) throws IOException, InterruptedException {
	navegador(site, "CHROME", " Executando navegador");
		
	}
	@Given("Realize o login")
	public void realize_o_login() throws IOException, InterruptedException {
	    login();
	}

	@When("Realizar a busca pela marca {string}")
	public void realizar_a_busca_pela_marca(String string) throws IOException, InterruptedException {
	 pesquisarMarca();
	}

	@When("selecionar o produto")
	public void selecionar_o_produto() {
	  
	}

	@When("Selecionar a quantidade")
	public void selecionar_a_quantidade() throws IOException, InterruptedException {
	    quantidade();
	}

	@When("Selecionar o botao Continuar compra")
	public void selecionar_o_botao_continuar_compra() throws IOException, InterruptedException {
	    adicionarCompra();
	}

	@When("selecionar o botao Forma de pagamento")
	public void selecionar_o_botao_forma_de_pagamento() throws IOException, InterruptedException {
	   formaPg();
	}

	@When("selecionar o pagamento desejado")
	public void selecionar_o_pagamento_desejado() throws IOException, InterruptedException {
	  dinheiro();
	}

	@When("Selecionar finalizar Compra")
	public void selecionar_finalizar_compra() throws IOException {
	  finalizarCompra();
	}

	@Then("valido o botao desfazer Pedido")
	public void valido_o_botao_desfazer_pedido() throws IOException, InterruptedException {
	   ValidarBtnDesfazerPedido();
	}

	
}
