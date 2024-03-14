package automacaoSiteOrange.steps;

import automacaoSiteOrange.pages.LoginPage;
import automacaoSiteOrange.runner.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FuncionalidadeLoginTest {

	String usuario = "Admin";
	String senha = "admin123";

	LoginPage page = new LoginPage();

	@Given("que eu esteja na tela de login {string}")
	public void queEuEstejaNaTelaDeLogin(String url) {
		Executa.iniciarTest(url);

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
		Executa.encerrarTest();

	}

	@When("informar usuario errado e senha correta")
	public void informarUsuarioErradoEsenhaCorreta() {
		page.login("errado", senha);

	}

	@Then("aparece mensagem de erro")
	public void apareceMensagemDeErro() {
		page.msgErro();
		Executa.encerrarTest();

	}
	
	@When("informar usuario correto e senha errada")
	public void informarUsuarioCorretoESenhaErrada() {
		page.login(usuario, "errado");

	   
	}
	
	
	
}
