package pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AmazonPage {
		
	WebDriver driver;


	public AmazonPage(WebDriver dr) {
		
		driver= dr;
		
		PageFactory.initElements(driver,this);
		
		
	}
		@FindBy(xpath="//a[@id='nav-link-accountList']")
				
		WebElement Signinbutton;
		
		@FindBy(xpath ="//input[@id='ap_email']")
		WebElement emailbox;
		
		@FindBy(xpath ="//input[@id='continue']")
		WebElement contineButton;
		
		@FindBy(xpath ="//input[@id='ap_password']")
		WebElement passsword;
		
		@FindBy(xpath ="//input[@id='signInSubmit']")
		WebElement SigninButton;
		
		@FindBy(xpath ="//input[@id='signInSubmit']]")
		WebElement SignIn;
		
		@FindBy(xpath ="//span[@id='nav-link-accountList-nav-line-1']")
		WebElement accountName;
		
		
		
		
	public void clickingOnSignInbutton() {
		Signinbutton.click();
		
	}

	public void enrerEmailAddress(String User_Name) {
		emailbox.sendKeys(User_Name);
	  contineButton.click();
	}
	  public void clickSignIn() {
		  
	  
	  Signinbutton.click();
	}


	public void enterpassword(String Password) {
		passsword.sendKeys(Password);
	}
	
	public String verifyAmazonAccount() {

	return accountName.getText(); 
	}
	}
	
	

