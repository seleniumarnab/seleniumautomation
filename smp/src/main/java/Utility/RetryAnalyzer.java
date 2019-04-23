package Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	
	//update from officec
	int count = 0;
	int limit = 9;

	public boolean retry(ITestResult result) {

		if (count < limit) {
			count++;
			return true;
		} else {
			return false;
		}

	}

}
