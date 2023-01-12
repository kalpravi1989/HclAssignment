package amazon;

import org.testng.annotations.Test;

public class TC_001 extends BaseClass {

	@Test
	public void test1() {
		HomePage hp = new HomePage(driver);
		hp.AllFn("television");
	}
}
