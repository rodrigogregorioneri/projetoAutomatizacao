package io.cronapp.projetoAutomatizacao.pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.firefox.FirefoxDriver;

public class MenuSuperiorIcone {

	private FirefoxDriver driver;
	private WebElement elemento;

	public MenuSuperiorIcone(FirefoxDriver driver){
		this.driver = driver;
	}
	
	public void btnNovoProjeto(){
		elemento = driver.findElementByCssSelector("*[ui-id='workspaceview-newProject']");
		elemento.click();
	}
}
