package automacaoSiteOrange.steps;

import automacaoSiteOrange.pages.LoginPage;
import automacaoSiteOrange.runner.Executa;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FuncionalidadeLoginTest {
    
	//Massa de teste
	String usuario = "Admin";
	String senha = "admin123";

	LoginPage page = new LoginPage();
	
	
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
		
	}
	
	
	@Given("que eu esteja na tela de login {string}")
	public void queEuEstejaNaTelaDeLogin(String url) {
		Executa.abrirNavegador(url,"Chrome");

	}

	@When("informar os dados validos")
	public void informarOsDadosValidos() {
		page.login(usuario, senha);

	}

	@When("clica no botao login")
	public void clicarNoBotaoLogin() {
		page.botaoLogin();

	}

	@Then("login efetuado com sucesso direcionando para tela de usuario logado")
	public void loginEfetuadoComSucessoDirecionandoParaTelaDeUsuarioLogado() {
		page.validacaoUrlLogada();
		

	}

	@When("informar usuario errado e senha correta")
	public void informarUsuarioErradoEsenhaCorreta() {
		page.login("errado", senha);

	}

	@Then("aparece mensagem de erro")
	public void apareceMensagemDeErro() {
		page.msgErroUsuarioSenha();
		

	}

	@When("informar usuario correto e senha errada")
	public void informarUsuarioCorretoESenhaErrada() {
		page.login(usuario, "errado");

	}

	@When("deixar o campo usuario em branco")
	public void deixarOCampoUsuarioEmBranco() {
		page.login("", senha);
	}

	@Then("aparece mensagem de erro usuario em branco")
	public void apareceMensagemDeErroUsuarioEmBranco() {
		page.msgErroUsuarioEmBranco();
		

	}

	@When("deixar o campo senha em branco")
	public void deixarOCampoSenhaEmBranco() {
		page.login(usuario, "");
		
	}

	@Then("aparece mensagem de erro senha em branco")
	public void apareceMensagemDeErroSenhaEmBranco() {
		page.msgErroSenhaEmBranco();
		
	}

}
