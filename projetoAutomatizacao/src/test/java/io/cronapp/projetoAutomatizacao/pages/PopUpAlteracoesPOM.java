package io.cronapp.projetoAutomatizacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpAlteracoesPOM {
	
	private FirefoxDriver driver;
	private WebElement elemento;

	public PopUpAlteracoesPOM(FirefoxDriver driver){
		this.driver = driver;
	}
 
	public void btnSalvar(){
		elemento = driver.findElementByCssSelector("*[ui-id='']");
		elemento.click();
	}
	
	public void btnCancelar(){
		elemento = driver.findElementByCssSelector("*[ui-id='']");
		elemento.click();
	}


}
