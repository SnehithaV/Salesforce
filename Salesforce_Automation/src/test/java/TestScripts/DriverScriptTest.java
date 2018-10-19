package TestScripts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;


public class DriverScriptTest extends AutomationScripts{

	@Test
	public static void mainmethod() throws Exception {
	
		String cur_dir = System.getProperty("user.dir");
		//String dt_path ="Users/kaushik/eclipse-workspace/Salesforce_Automation/src/test/resources/Utility/SalesforceTestCaseNames.xls";
		String dt_path = cur_dir + "/src/test/resources/Utility/SalesforceTestCaseNames.xls";	
		String[][] recData = ReusableMethods.readXLData(dt_path, "Sheet1");
		
		initializeExtentReport("Salesforce");
		String Flag =null;
		String testCase=null;
		for(int i=1;i<recData.length;i++) {
				Flag=recData[i][1];
				if(Flag.equalsIgnoreCase("Y")) {
					testCase = recData[i][2];
					Method testScript = AutomationScripts.class.getMethod(testCase);
					testScript.invoke(testScript);
				}
				else {
					System.out.println("*******Row Number" +i +"test case name " +recData[i][2] +" is not executed");
				}
			
			 
			 
		}			
		
		endExtentReport();
	}

	}


