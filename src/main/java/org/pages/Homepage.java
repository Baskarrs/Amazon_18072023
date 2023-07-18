package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver ;
	
	public Homepage() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtSearch ;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement btnSearch ;

	
	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	

}
