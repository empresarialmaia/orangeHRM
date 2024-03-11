package automacaoSiteOrange.steps;

import automacaoSiteOrange.pages.LoginPage;
import automacaoSiteOrange.runner.Executa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FuncionalidadeLoginTest {

	LoginPage page = new LoginPage();

	@Given("que eu esteja na tela de login {string}")
	public void queEuEstejaNaTelaDeLogin(String url) {
		Executa.iniciarTest(url);

	}

	@When("informar os dados validos")
	public void informarOsDadosValidos() {
		page.loginUsuarioComSucesso();
		page.loginSenhaComSucesso();

	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
		page.botaoLogin();

	}

	@Then("login efetuado com sucesso direcionando para tela de usuario logado")
	public void loginEfetuadoComSucessoDirecionandoParaTelaDeUsuarioLogado() {
		page.validacaoUrl();
		Executa.encerrarTest();

	}

	@When("informar usuario errado")
	public void informarUsuarioErrado() {
		page.loginUsuarioIncorreto();

	}

	@When("informar a senha correta")
	public void informarASenhaCorreta() {
		page.loginSenhaComSucesso();

	}

	@Then("aparece mensagem Invalid credentials")
	public void apareceMensagemInvalidCredentials() {
		page.loginUsuarioIncorreto();
		

	}

}
