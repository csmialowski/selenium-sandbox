package br.com.brenda.folha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PaginaInicial extends Pagina {
	
	public PaginaInicial(WebDriver driver){
		super(driver);
		
	}
	
	@FindBy(linkText = "Cultura") WebElement menuCultura;
	
	@FindBy(linkText = "Ilustrada") WebElement linkIlustrada;
	
	public void navegarPaginaInicial(){
		driver.get("http://www.folha.uol.com.br/");
	}
	
	public void navegarMenuCultura(){
		Actions acoes = new Actions(this.driver);
		acoes.moveToElement(menuCultura).build().perform();
		acoes.moveToElement(linkIlustrada).click().build().perform();
	}
	


}
