package automacaoSiteOrange.steps;

import automacaoSiteOrange.pages.TelaPrincipalPage;
import automacaoSiteOrange.runner.Executa;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FuncionalidadeTelaPrincipalTest {
	
	//Massa de teste
		String usuario = "Admin";
		String senha = "admin123";
	
	TelaPrincipalPage pageTela = new  TelaPrincipalPage();	  	    
	 
   @After
   public void finalizarTeste() {
	   Executa.fecharNavegador();
	   
   }
	

	@Given("que esteja na tela principal ja logado {string}")
	public void queEstejaNaTelaPrincipalJaLogado(String url) {
		Executa.abrirNavegador(url, "chrome");
		pageTela.telaPrincipalLogado(usuario,senha);
	    
	}
	@When("escrever na barra de pesquisa a opcao desejada")//
	public void escreverNaBarraDePesquisaAOpcaoDesejada() {
		pageTela.escreverCampoPesquisa("Admin");
	    
	}
	@When("o sistema informa as opcoes com base na palavra informada")
	public void oSistemaInformaAsOpcoesComBaseNaPalavraInformada() {
		pageTela.validacaoTextoPesquisa("Admin");
	
	}
	@Then("clico na opcao que foi disponibilizada pelo sistema com base na palavra informada")
	public void clicoNaOpcaoQueFoiDisponibilizadaPeloSistemaComBaseNaPalavraInformada() {
	   pageTela.clicarNaOpcaoPesquisada();
	   pageTela.validacaoPrint("positivoTelaPrincipal", "Pesquisa_item_existente");
	  
	}


	@When("escrever na barra de pesquisa uma opcao não existe desejada")//
	public void escreverNaBarraDePesquisaUmaOpcaoNãoExisteDesejada() {
		pageTela.escreverCampoPesquisaErro("texto");
	    
	}
	@Then("o sistema nao informa nenhuma opcao com base na palavra informada")
	public void oSistemaNaoInformaNenhumaOpcaoComBaseNaPalavraInformada() {
		pageTela.validacaoPrint("negativoTelaPrincipal","Pesquisa_item_inexistente");
		
		
	   
	}
	 



}
