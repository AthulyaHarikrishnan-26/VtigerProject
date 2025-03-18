package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ListenersClass implements ITestListener {

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + " testcase execution started");

		test = report.startTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		// Reporter.log(methodName + " testcase passed");

		test.log(LogStatus.PASS, methodName + " pass");

		report.endTest(test);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
//		Reporter.log(methodName + " testcase failed");
//		Reporter.log(result.getThrowable().toString());

		GenericUtilities gu = new GenericUtilities();

		String path = "C:\\AUTOMATION TESTING\\M3Vtiger\\src\\test\\resources\\defectimages\\Vtiger_" + methodName + "_"
				+ gu.currentDate() + ".jpg";

		test.log(LogStatus.FAIL, test.addScreenCapture(gu.captureScreenshot(BaseClass.sdriver, path)));
		// gu.captureScreenshot(BaseClass.sdriver, path);

		report.endTest(test);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
//		Reporter.log(methodName + " testcase skipped");
//		Reporter.log(result.getThrowable().toString());

		test.log(LogStatus.SKIP, methodName + " Skipped");

		report.endTest(test);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Execution Started");
		report = new ExtentReports("./reports/extentReport_Vtiger.html");

		report.addSystemInfo("OS", "Windows 10");
		report.addSystemInfo("browser", "Edge");
		report.addSystemInfo("User Name", "Athulya");
		report.addSystemInfo("Project Name", "Vtiger");
		report.addSystemInfo("BaseUrl", "http://localhost:8888/");
		report.addSystemInfo("username", "admin");
		report.addSystemInfo("password", "admin");

		// add system info is used to add information.

	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Execution Finished");

		report.flush();
	}

}
