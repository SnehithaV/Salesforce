package TestScripts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class AutomationScripts extends ReusableMethods{
	
	public static void Login_Error_Message_1() throws InterruptedException, IOException {
		Properties pro=new Properties();
		//BufferedReader reader = new BufferedReader(new FileReader("./src/DataFiles/Configuration.properties"));
		BufferedReader reader = new BufferedReader(new FileReader("./src/test/resources/DataFiles/config.properties"));
		pro.load(reader);
		createTestScriptReport("Login_Error_Message_1");
		String expData="Please enter your password.Snehitha";
		IntializeDriver("firefox");
		driver.get(pro.getProperty("salesforceUrl"));
		//driver.get("https://login.salesforce.com/");
		logger.log(Status.INFO,"salesforce page opened");
		System.out.println("salesforce page opened");
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		enterText(username, "username field","User@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		logger.log(Status.INFO,"password field cleared");
		WebElement loginButton=driver.findElement(By.id("Login"));
		clickElement(loginButton, "Login");
		logger.log(Status.INFO,"login button clicked");
		WebElement actuaError=driver.findElement(By.xpath("//div[@id='error']"));
		verifyText(actuaError, "error message",expData);
		closeDriver();
	}
	
	public static void Login_To_SalesForce_2() {
		createTestScriptReport("Login_To_SalesForce_2");
		IntializeDriver("Firefox");
		driver.get("https://login.salesforce.com/");
		logger.log(Status.INFO,"salesforce page opened");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		enterText(userName,"userName field","varanasi.snehitha@gmail.com");
		logger.log(Status.INFO, "data entered in username field");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		enterText(password,"Password Field","Lkjkl1234%");
		logger.log(Status.INFO, "data entered in password field");
		WebElement loginButton=driver.findElement(By.id("Login"));
		clickElement(loginButton, "Login");
		logger.log(Status.INFO,"login button clicked");
		//closeDriver();
	}
	
	public static void Check_RemeberMe_3() throws IOException {
		createTestScriptReport("Check_RemeberMe_3");
		IntializeDriver("Firefox");
		driver.get("https://login.salesforce.com/");
		logger.log(Status.INFO,"salesforce page opened");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		enterText(userName,"userName field","varanasi.snehitha@gmail.com");
		logger.log(Status.INFO, "data entered in username field");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		enterText(password,"Password Field","Lkjkl1234%");
		logger.log(Status.INFO, "data entered in password field");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		clickElement(checkBox, "Remember Me");
		logger.log(Status.INFO, "selected the checkbox");
		WebElement loginButton=driver.findElement(By.id("Login"));
		clickElement(loginButton, "Login");
		logger.log(Status.INFO,"login button clicked");
		WebElement dropDownMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
		clickElement(dropDownMenu, "Menu");
		logger.log(Status.INFO,"dropdown button clicked");
		WebElement logoutlink=driver.findElement(By.xpath("//a[@href=\"/secur/logout.jsp\"]"));
		clickElement(logoutlink, "Logout");
		logger.log(Status.INFO,"logout button clicked");
		WebElement userName1 = driver.findElement(By.xpath("//span[@id='idcard-identity']"));
		verifyText(userName1,"UserName1","varanasi.snehitha@gmail.com");
		System.out.println("both are same");
		closeDriver();
	}
		public static void Forgot_Password_4_A() {
			createTestScriptReport("Forgot_Password_4_A");
			IntializeDriver("Firefox");
			driver.get("https://login.salesforce.com/");
			logger.log(Status.INFO,"salesforce page opened");
			WebElement forgotPassword = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
			clickElement(forgotPassword,"Forgot Password");
			logger.log(Status.INFO, "clicked on forgot password");
			WebElement userName1 = driver.findElement(By.xpath("//input[@id='un']"));
			enterText(userName1,"userName1","varanasi.snehitha@gmail.com");
			logger.log(Status.INFO, "data entered in username field");
			WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
			clickElement(continueButton,"Continue");
			logger.log(Status.INFO, "continue button clicked");
			closeDriver();
		}
		
		public static void ValidateLoginErrorMessage_5() throws IOException {
			createTestScriptReport("ValidateLoginErrorMessage_5");
			IntializeDriver("Firefox");
			driver.get("https://login.salesforce.com/");
			logger.log(Status.INFO,"salesforce page opened");
			WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(un,"userName","123");
			logger.log(Status.INFO,"data entered in username field");
			WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(pw,"password","22131");
			logger.log(Status.INFO,"data entered in password field");
			WebElement loginButton=driver.findElement(By.id("Login"));
			clickElement(loginButton, "Login");
			logger.log(Status.INFO,"login button clicked");
			String expData="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
			WebElement actuaError=driver.findElement(By.xpath("//div[@id='error']"));
			verifyText(actuaError, "error message",expData);
			closeDriver();
		}
		public static void TC05() {
			createTestScriptReport("TC05");
			IntializeDriver("firefox");
			driver.get("https://login.salesforce.com/");
			logger.log(Status.INFO,"salesforce page opened");
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName,"userName field","varanasi.snehitha@gmail.com");
			logger.log(Status.INFO, "data entered in username field");
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			enterText(password,"Password Field","Lkjkl1234%");
			logger.log(Status.INFO, "data entered in password field");
			WebElement loginButton=driver.findElement(By.id("Login"));
			clickElement(loginButton, "Login");
			logger.log(Status.INFO,"login button clicked");
			WebElement dropDownMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
			clickElement(dropDownMenu, "Menu");
			logger.log(Status.INFO,"dropdown button clicked");
			//closeDriver();
		}
		public static void TC06() throws InterruptedException {
			createTestScriptReport("TC06");
			IntializeDriver("chrome");
			driver.get("https://login.salesforce.com/");
			logger.log(Status.INFO,"salesforce page opened");
			WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(un,"Username","varanasi.snehitha@gmail.com");
			logger.log(Status.INFO, "data entered in username field");
			WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(pw,"Password","Lkjkl1234%");
			logger.log(Status.INFO, "data entered in password field");
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			clickElement(login,"Login");
			logger.log(Status.INFO,"login button clicked");
			WebElement dropDownMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
			clickElement(dropDownMenu,"DropDown");
			logger.log(Status.INFO,"dropdown button clicked");
			WebElement myProfile = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[1]"));
			clickElement(myProfile,"My Profile");
			logger.log(Status.INFO,"MyProfile clicked");
			WebElement edit = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
			clickElement(edit,"Edit Profile");
			driver.switchTo().frame("contactInfoContentId");
			logger.log(Status.INFO, "Switched to frame");
			WebElement about = driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
			clickElement(about,"about");
			logger.log(Status.INFO, "clicked about tab");
			WebElement lastName = driver.findElement(By.xpath(".//*[@id='lastName']"));
			lastName.clear();
			lastName.sendKeys("Varanasi");
			logger.log(Status.INFO, "last name modified to Varanasi");
			WebElement saveAll = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/input[1]"));
			saveAll.click();
			logger.log(Status.INFO, "clicked on save all button");
			driver.switchTo().defaultContent();
			System.out.println("Clicked on saveAll  and back to default window");
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(10000);
			
			WebElement post=driver.findElement(By.xpath(".//*[@id='publisherAttachTextPost']/span[1]"));
			clickElement(post, "Post");
			Thread.sleep(4000);
			
			WebElement frame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
			driver.switchTo().frame(frame);
			logger.log(Status.INFO, "switched");
			Thread.sleep(10000);
			System.out.println("tag html?  "+driver.findElements(By.xpath("//html/body")));
			WebElement postMessage=driver.findElement(By.xpath("/html/body"));
			enterText(postMessage, "Posting info", "This is using Automation");
			logger.log(Status.INFO, "text entered");
			driver.switchTo().defaultContent();
			WebElement shareButton=driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
			clickElement(shareButton, "Share");
			logger.log(Status.INFO, "clicked on share button");
			Thread.sleep(2000);
			WebElement file = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
			//WebElement file=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='publisherAttachContentPost']/span[1]")));
			clickElement(file, "file link is clicked");
			System.out.println("Clicked on file");
			Thread.sleep(4000);
			WebElement upload=driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
			clickElement(upload, "upload is clicked");
			System.out.println("Clicked on upload");
			//WebElement browse=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/input[@id='chatterFile']")));
			WebElement browse=driver.findElement(By.xpath(".//*[@id='chatterFile']"));
			enterText(browse,"data in browse","/Users/kaushik/Desktop/data.txt");
			WebElement share = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
			clickElement(share, "file shared");
			Thread.sleep(2000);
			
			//Add Photo
			Actions mousehoover = new Actions(driver);
			mousehoover.moveToElement(driver.findElement(By.xpath("//*[@id='displayBadge']"))).perform();
			WebElement addPhoto = driver.findElement(By.xpath("//a[@id=\"uploadLink\"]"));
			clickElement(addPhoto, "add photo is clicked");
			Thread.sleep(5000);
			System.out.println("add photo is clicked");
			WebElement photoframe=driver.findElement(By.id("uploadPhotoContentId"));
			driver.switchTo().frame(photoframe);
			System.out.println("switched");
			WebElement browsePhoto=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']"));
		
			browsePhoto.sendKeys("/Users/kaushik/Desktop/download.PNG");
			WebElement savePhoto=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']"));
			clickElement(savePhoto, "file shared");
			
			Actions action=new Actions(driver); 
			action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='j_id0:outer']/div[1]/div/div/div/div[6]")), 100, 20);
			driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']")).click(); 

			driver.switchTo().defaultContent();
			driver.close();
			
		}
		public static void TC07() throws InterruptedException {
			createTestScriptReport("TC07");
			IntializeDriver("chrome");
			driver.get("https://login.salesforce.com/");
			logger.log(Status.INFO,"salesforce page opened");
			WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(un,"Username","varanasi.snehitha@gmail.com");
			logger.log(Status.INFO, "data entered in username field");
			WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
			enterText(pw,"Password","Lkjkl1234%");
			logger.log(Status.INFO, "data entered in password field");
			WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
			clickElement(login,"Login");
			logger.log(Status.INFO,"login button clicked");
			WebElement dropDownMenu = driver.findElement(By.xpath("//div[@id='userNav-arrow']"));
			clickElement(dropDownMenu,"DropDown");
			logger.log(Status.INFO,"dropdown button clicked");
			WebElement mySettings = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[2]"));
			clickElement(mySettings, "My Settings");
			logger.log(Status.INFO, "My Setting tab opened from menu");
			WebElement personal = driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
			clickElement(personal,"Personal");
			logger.log(Status.INFO,"Personal link is clicked");
			System.out.println("Personal is clicked");
			WebElement loginHistory = driver.findElement(By.id("LoginHistory_font"));
			clickElement(loginHistory, "Login History");
			logger.log(Status.INFO, "Login History clicked");
			System.out.println("Login clicked");
			WebElement downloadLoginHistory= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]"));
			//clickElement(downloadLoginHistory, "Download Login History");
			//driver.switchTo().window(arg0)
			logger.log(Status.INFO, "Download Login History selected");
			WebElement displayAndLayout = driver.findElement(By.id("DisplayAndLayout"));
			clickElement(displayAndLayout, "displayAndLayout");
			logger.log(Status.INFO, "displayAndLayout clicked");
			System.out.println("displayAndLayout clicked");
			WebElement customizeTabs = driver.findElement(By.id("CustomizeTabs_font"));
			clickElement(customizeTabs, "customizeTabs");
			logger.log(Status.INFO, "customizeTabs clicked");
			System.out.println("customizeTabs clicked");
			WebElement selectMenu = driver.findElement(By.xpath("//select[@id='p4']"));
			Select select = new Select(selectMenu);
			select.selectByVisibleText("Salesforce Chatter");
			System.out.println("Salesforce chatter selected");
			WebElement selectAvailableTabs = driver.findElement(By.id("duel_select_0"));
			select = new Select(selectAvailableTabs);
			select.selectByVisibleText("Reports");
			System.out.println("Reports selected");
			WebElement add = driver.findElement(By.xpath("//img[@title='Add']"));
			clickElement(add,"add button");
			WebElement email = driver.findElement(By.id("EmailSetup"));
			clickElement(email, "email");
			logger.log(Status.INFO, "email clicked");
			WebElement emailSettings = driver.findElement(By.id("EmailSettings_font"));
			clickElement(emailSettings, "emailSettings");
			logger.log(Status.INFO, "emailSettings clicked");
			WebElement emailName = driver.findElement(By.id("sender_name"));
			emailName.clear();
			enterText(emailName,"Email Name","Snehitha Varanasi");
			logger.log(Status.INFO, "emailName entered");
			WebElement emailAddress = driver.findElement(By.id("sender_email"));
			emailAddress.clear();
			enterText(emailAddress,"Email Address","varanasi.snehitha@gmail.com");
			logger.log(Status.INFO, "emailAddress entered");
			System.out.println("Email entered");
			List<WebElement> radio_button = driver.findElements(By.name("auto_bcc"));
			boolean bvalue;
			bvalue=radio_button.get(1).isSelected();
			if(bvalue==false) {
				radio_button.get(0).click();
			}
			else {
				System.out.println("already selected");
			}
			System.out.println("radio button selected");
			WebElement save = driver.findElement(By.xpath("//input[@type='submit' and @name='save']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(save).click().perform();
			//clickElement(save, "Save Button");
			Thread.sleep(5000);
			WebElement calendarAndReminders = driver.findElement(By.id("CalendarAndReminders_font"));
			clickElement(calendarAndReminders, "calendarAndReminders");
			logger.log(Status.INFO, "calendarAndReminders clicked");
			System.out.println("calender opened");
			WebElement activityReminders = driver.findElement(By.id("Reminders_font"));
			clickElement(activityReminders, "emailSettings");
			logger.log(Status.INFO, "activityReminders clicked");
			System.out.println("activity reminder opened");
			Thread.sleep(4000);
			WebElement openATestReminder = driver.findElement(By.id("testbtn"));
			Actions actions1 = new Actions(driver);
			actions.moveToElement(openATestReminder).click().perform();
			logger.log(Status.INFO, "openATestReminder clicked");
			driver.close();
		}
		public static void TC08() throws InterruptedException, IOException {
			TC05();
			WebElement developerConsole = driver.findElement(By.xpath("/html/body/div[1]/div[1]/table/tbody/tr/td[3]/div/div[3]/div/div/div[2]/div[3]/a[3]"));
			clickElement(developerConsole, "developerConsole");
			String oldWindow = driver.getWindowHandle();
			Set<String> getAllWindows = driver.getWindowHandles();	
			String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
			driver.switchTo().window(getWindow[1]);
			//getWindow[1].
			driver.switchTo().window(oldWindow);
			driver.close();
		}
		public static void TC09() throws InterruptedException {
			TC05();
			WebElement logoutlink=driver.findElement(By.xpath("//a[@href=\"/secur/logout.jsp\"]"));
			clickElement(logoutlink, "Logout");
			logger.log(Status.INFO,"logout button clicked");
			driver.close();
		}
		public static void TC10_CreateAccount() {
			Login_To_SalesForce_2();
			WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
			clickElement(accounts, "Accounts");
			logger.log(Status.INFO,"accounts link clicked");
			WebElement close = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			clickElement(close,"Close");
			logger.log(Status.INFO,"window closed");
			WebElement newButton = driver.findElement(By.xpath("//input[@title='New']"));
			clickElement(newButton, "new");
			logger.log(Status.INFO,"new clicked");
			WebElement accountName = driver.findElement(By.id("acc2"));
			enterText(accountName, "Account Name", "Snehitha24");
			logger.log(Status.INFO,"data entered in the field");
			WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
			clickElement(save, "Save Data");
			driver.close();
		}
		
		public static void TC11_Createnewview() {
			Login_To_SalesForce_2();
			WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
			clickElement(accounts, "Accounts");
			logger.log(Status.INFO,"accounts link clicked");
			WebElement close = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			clickElement(close,"Close");
			logger.log(Status.INFO,"window closed");
			WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			clickElement(createNewView, "Create New View");
			logger.log(Status.INFO,"createNewView clicked");
			WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
			viewName.clear();
			enterText(viewName,"View Name","MyFirstView");
			logger.log(Status.INFO, "view name entered");
			WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
			enterText(viewUniqueName, "View Unique Name", "First_View");
			logger.log(Status.INFO, "View Unique Name entered");
			WebElement save = driver.findElement(By.xpath(" //div[@class='pbHeader']//input[@title='Save']"));
			clickElement(save, "Save Button");
			logger.log(Status.INFO, "Saved");
		    driver.close();
			
		}
		
		public static void TC12_Editview() {
			Login_To_SalesForce_2();
			WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
			clickElement(accounts, "Accounts");
			logger.log(Status.INFO,"accounts link clicked");
			WebElement close = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			clickElement(close,"Close");
			WebElement viewDropDown = driver.findElement(By.xpath("//select[@id='fcf']"));
			Select select = new Select(viewDropDown);
			select.selectByVisibleText("MyFirstView");
			WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[2]/a[1]"));
			clickElement(edit, "Edit");
			logger.log(Status.INFO, "Edit Clicked");
			WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
			viewName.clear();
			enterText(viewName,"View Name","MyFirstViewUpdated");
			logger.log(Status.INFO, "new view name entered");
			WebElement field = driver.findElement(By.xpath("//select[@id='fcol1']"));
			select = new Select(field);
			select.selectByVisibleText("Account Name");
			logger.log(Status.INFO, "Account Name Selected");
			WebElement operator=driver.findElement(By.xpath("//select[@id='fop1']"));
			select=new Select(operator);
			select.selectByVisibleText("contains");
			logger.log(Status.INFO, "Contains Selected");
			WebElement value=driver.findElement(By.xpath("//input[@id='fval1']"));
			enterText(value,"value","a");
			logger.log(Status.INFO, "'a' entered");
			WebElement selectFields = driver.findElement(By.xpath("//select[@id='colselector_select_0']"));
			select = new Select(selectFields);
			select.selectByVisibleText("Last Activity");
			logger.log(Status.INFO, "Last Activity Selected");
			WebElement add = driver.findElement(By.xpath("//a[@id='colselector_select_0_right']//img[@title='Add']"));
			clickElement(add, "Add");
			logger.log(Status.INFO, "Add button clicked");
			WebElement save = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Save']"));
			clickElement(save, "Save");
			logger.log(Status.INFO, "Saved");
			driver.close();
		}
		
		public static void TC13_MergeAccounts() {
			Login_To_SalesForce_2();
			WebElement accounts=driver.findElement(By.xpath("//a[@title='Accounts Tab']"));
			clickElement(accounts, "Accounts");
			logger.log(Status.INFO,"accounts link clicked");
			WebElement close = driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
			clickElement(close,"Close");
			WebElement mergeAccounts = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
			clickElement(mergeAccounts, "Merge Accounts");
			logger.log(Status.INFO, "Merge links clicked");
			WebElement accountName = driver.findElement(By.xpath("//input[@id='srch']"));
			enterText(accountName, "Account Name", "aa");
			logger.log(Status.INFO, "account name entered");
			WebElement findAccounts = driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[2]"));
			clickElement(findAccounts, "Find Accounts");
			logger.log(Status.INFO, "Find Accounts clicked");
			WebElement next = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Next']"));
			clickElement(next, "Next");
			logger.log(Status.INFO, "Next clicked");
			System.out.println("clicked next");
			WebElement merge = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Merge']"));
			clickElement(merge, "Merge");
			logger.log(Status.INFO, "Merge Clicked");
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.close();
		}
	/*public static void main(String[] args) throws InterruptedException, IOException {
		initializeExtentReport("Salesforce");
		//Login_Error_Message_1();
		//Login_To_SalesForce_2();
		//Check_RemeberMe_3();
		//Forgot_Password_4_A();
		//ValidateLoginErrorMessage_5();
		//TC05();
		//TC06();
		//TC07();
		//TC08();
		//TC09();
		//TC10_CreateAccount();
		//TC11_Createnewview();
		//TC12_Editview();
		//TC13_MergeAccounts();
		
		endExtentReport();
		System.out.println("Completed");
	}*/


}
