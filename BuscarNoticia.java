package br.com.brenda.folha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BuscarNoticia extends PaginaIlustrada{

	public BuscarNoticia(WebDriver driver) {
		super(driver);
	}
		@FindBy(linkText = "David Gilmour, do Pink Floyd, fará três shows no Brasil em dezembro") WebElement showFoda;
		
		public void buscarShowFoda(){
			Actions acoes = new Actions(this.driver);
			acoes.moveToElement(showFoda).click().build().perform();
		}
	}
	