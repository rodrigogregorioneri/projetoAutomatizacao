package io.cronapp.projetoAutomatizacao.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GerenciamentoDriver {
	
	protected FirefoxDriver driver;
	
	
//	public GerenciamentoDriver(FirefoxDriver driver){
//		System.setProperty("webdriver.gecko.driver", "C:\\software\\libs\\geckodriver-v0.10.0-win64\\geckodriver.exe");
//		this.driver = driver;
//	}
//	
	public GerenciamentoDriver(){
		System.setProperty("webdriver.gecko.driver", "C:\\software\\libs\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		this.driver = new FirefoxDriver();
	}
	
	@Before
	public void inicializaNavegador() throws InterruptedException{
		driver.get("https://ide.cronapp.io/workspace");
		driver.manage().window().maximize();
		System.out.println("Navegador iniciado OK");
		Thread.sleep(5000);
	}
	
	@After
	public void encerraNavegador(){
		driver.close();
	}
	

}
