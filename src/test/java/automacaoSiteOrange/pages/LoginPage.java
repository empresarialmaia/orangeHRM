package automacaoSiteOrange.pages;

import org.openqa.selenium.By;

import automacaoSiteOrange.metodos.Metodos;

public class LoginPage {

	 By textoPaginaDeLogin= By.xpath("//h5[contains(.,'Login')]");

	 By usuario = By.name("username");
	 By senha = By.name("password");
	 By btnLogin = By.xpath("//button[@type='submit']");
	 By msgErroUsuario = By.xpath("//p[text()='Invalid credentials']");
	 By msgErroUsuarioSenhaBranco = By.xpath("//span[contains(.,'Required')]");
	 By textoUsuarioLogado = By.xpath("//h6[text()='Dashboard']");
	 
	 	
	
	Metodos metodo = new Metodos();

	public void login(String usuario, String senha) {
		metodo.esperarElementoVisivel(this.usuario);
		metodo.escrever(this.usuario, usuario);
		metodo.escrever(this.senha, senha);

	}

	public void botaoLogin() {		
		metodo.clicar(this.btnLogin);
		
	}

	public void validacaoUrlLogada(String historia, String nomeArquivo, String url) {
		metodo.esperarElementoVisivel(this.textoUsuarioLogado);
		metodo.printTela(historia, nomeArquivo);
		metodo.validarUrl(url);
	
		
	}

	public void msgErroUsuarioSenha(String msg, String historia, String nomeAqrquivo) {	
		metodo.esperarElementoVisivel(this.msgErroUsuario);
		metodo.validarTexto(this.msgErroUsuario, msg);
		metodo.printTela(historia, nomeAqrquivo);
		
		
	}
	
	public void msgErroUsuarioEmBranco(String msg, String historia, String nomeArquivo) {		
		metodo.validarTexto(this.msgErroUsuarioSenhaBranco, msg);
		metodo.printTela(historia, nomeArquivo);
		
		
	}
	
	public void msgErroSenhaEmBranco(String msg, String historia, String nomeArquivo) {		
		metodo.validarTexto(this.msgErroUsuarioSenhaBranco, msg);
		metodo.printTela(historia, nomeArquivo);
		
		
		

	}
	
	public void textoPaginaLogin(String textoPaginaDeLogin) {
		metodo.esperarElementoVisivel(this.textoPaginaDeLogin);
		metodo.validarTexto(this.textoPaginaDeLogin, textoPaginaDeLogin);
	}
}
