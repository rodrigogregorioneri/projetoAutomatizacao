package io.cronapp.projetoAutomatizacao.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GerenciamentoDriver {
	
	protected FirefoxDriver driver;
	Config configuracao = new Config();
	
	public GerenciamentoDriver(){
		System.setProperty(configuracao.pacoteGeckodrive, configuracao.conexao);
		this.driver = new FirefoxDriver();
	}
	
	@Before
	public void inicializaNavegador() throws InterruptedException{
		driver.get("https://ide.cronapp.io/workspace");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@After
	public void encerraNavegador(){
		driver.close();
		driver.quit();
	}
	
}
