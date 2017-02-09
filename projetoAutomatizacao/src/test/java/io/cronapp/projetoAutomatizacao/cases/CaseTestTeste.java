package io.cronapp.projetoAutomatizacao.cases;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cronapp.projetoAutomatizacao.pages.Login;
import io.cronapp.projetoAutomatizacao.pages.MenuSuperiorIcone;
import io.cronapp.projetoAutomatizacao.util.GerenciamentoDriver;

public class CaseTestTeste extends GerenciamentoDriver{
	
	Login login;
	MenuSuperiorIcone menu;
	//GerenciamentoDriver gerencia = new GerenciamentoDriver(driver);
	
	

	@Test
	public void inicio(){
		login = new Login(driver);
		menu = new MenuSuperiorIcone(driver);
		login.logar();
		System.out.println("login ok");
		login.esperaComponente(15);
		//login.btnNovoProjeto();
		menu.btnNovoProjeto();
	}
	
	
	@Test
	public void inicio1(){
		login = new Login(driver);
		menu = new MenuSuperiorIcone(driver);
		login.logar();
		System.out.println("login ok");
		login.esperaComponente(15);
		//login.btnNovoProjeto();
		menu.btnNovoProjeto();
	}

}
