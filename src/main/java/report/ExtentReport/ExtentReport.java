package report.ExtentReport;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	
	ExtentReports extent;
	@BeforeMethod
	public void confiq()
	
	{
  		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation Report");
		
		
		
		extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Venkatesu");
	}
	
	@Test 
	public void demoMethod()
	{
		ExtentTest test =extent.createTest("demoMethod");
  		System.setProperty("webdriver.chrome.driver", "C:\\my softwares\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        System.out.println(driver.getTitle());
        test.addScreenCaptureFromPath("C:\\my softwares\\image.png");
        test.fail("Details does not matched");
		extent.flush();
		
	}

}
