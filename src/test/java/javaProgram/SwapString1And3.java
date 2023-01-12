package javaProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapString1And3 {

	@Test
	public void test1() {
		String s = "i am mohan from bangalore";
		StringBuffer ans = swapString(s);
		System.out.println(ans);
		Assert.assertEquals(ans.toString(), "mohan am i from bangalore");
	}

	@Test
	public void test2() {
		String s = "";
		StringBuffer ans = swapString(s);
		System.out.println(ans);
		Assert.assertEquals(ans.toString(), "");
	}

	@Test
	public void test3() {
		String s = "i am";
		StringBuffer ans = swapString(s);
		System.out.println(ans);
		Assert.assertEquals(ans.toString(), "i am");
	}

	@Test
	public void test4() {
		String s = "i";
		StringBuffer ans = swapString(s);
		System.out.println(ans);
		Assert.assertEquals(ans.toString(), "i");
	}
	private StringBuffer swapString(String str) {
		StringBuffer res = new StringBuffer();
		String[] s = str.split(" ");
		String[] a = s.clone();
		if (s.length > 2) {
		a[0] = s[2];
		a[2] = s[0];
	}

		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				res.append(a[i]).append(" ");
			} else {
				res.append(a[i]);
			}
		}

		return res;
	}
}
