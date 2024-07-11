package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {

	ElementosLogin login = new ElementosLogin();
	Metodos metodo = new Metodos();

	public void login(String usuario, String senha) {
		//metodo.aguardar();
		metodo.escrever(login.username, usuario);
		metodo.escrever(login.password, senha);

	}

	public void botaoLogin() {
		metodo.clicar(login.btnLogin);
	}

	public void validacaoUrlLogada() {
		metodo.validarUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	public void msgErro() {
		//metodo.aguardar();
		metodo.validarTexto(login.msgErroUsuario, "Invalid credentials");
	}
	
	public void msgErroUsuarioEmBranco() {
		//metodo.aguardar();
		metodo.validarTexto(login.msgErroUsuarioBranco, "Required");
	}
	
	public void msgErroSenhaEmBranco() {
		//metodo.aguardar();
		metodo.validarTexto(login.msgErroSenhaBranco, "Required");
	}
}
