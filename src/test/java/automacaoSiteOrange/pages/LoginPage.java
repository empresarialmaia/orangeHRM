package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {

	ElementosLogin Elelogin = new ElementosLogin();
	Metodos metodo = new Metodos();

	public void login(String usuario, String senha) {
		metodo.esperarElementoVisivel(Elelogin.username, 5);
		metodo.escrever(Elelogin.username, usuario);
		metodo.escrever(Elelogin.password, senha);

	}

	public void botaoLogin() {		
		metodo.clicar(Elelogin.btnLogin);
		
	}

	public void validacaoUrlLogada() {
		metodo.esperarElementoVisivel(Elelogin.textoUsuarioLogado, 5);
		metodo.printTela("positivoLogin", "Login com sucesso");
		metodo.validarUrl("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	public void msgErroUsuarioSenha() {	
		metodo.esperarElementoVisivel(Elelogin.msgErroUsuario, 5);
		metodo.validarTexto(Elelogin.msgErroUsuario, "Invalid credentials");
		metodo.printTela("negativoLogin", "Mensagem credenciais inválidas");
	}
	
	public void msgErroUsuarioEmBranco() {		
		metodo.validarTexto(Elelogin.msgErroUsuarioBranco, "Required");
		metodo.printTela("negativoLogin", "Mensagem usuario em branco");
	}
	
	public void msgErroSenhaEmBranco() {		
		metodo.validarTexto(Elelogin.msgErroSenhaBranco, "Required");
		metodo.printTela("negativoLogin", "Mensagem senha em branco");

	}
}
