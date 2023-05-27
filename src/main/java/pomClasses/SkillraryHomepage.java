package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class 
 * @author kalya
 *
 */
public class SkillraryHomepage
{


	// Declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	@FindBy(xpath = "//ul[contains(@class,'home_menu')]/li[1]")
	private WebElement language;
	
	@FindBy(xpath = "//ul[contains(@class,'home_menu')]/descendant::a[text()=' English ']")
	private WebElement english;
	
	//Intialization
	public  SkillraryHomepage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	//Utilization
	/**
	 * This method returns Skillrary home page logo
	 * @return
	 */
	public WebElement getLogo()
	{
		return logo;
		
	}
	/**
	 * This method is used to click an Gears Tab
	 */
	public void clickGearsTab()
	{
		gearsTab.click();
		
	}
	/**
	 * This method is used to click an skillrary demo app link
	 */
	public void clickSkillraryDemoApp()
	{
		skillraryDemoAppLink.click();
	}
	/**
	 * This method is used to select english as default language
	 */
	public void chooseEnglish()
	{
		language.click();
		english.click();
	}
	
		
	}

