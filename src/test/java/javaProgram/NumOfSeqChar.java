package javaProgram;

import org.testng.annotations.Test;

public class NumOfSeqChar {

	@Test
	public void test1() {
		String s = "aaabbbbccdddaab";
		StringBuilder ans = findNumOfSeqChar(s);
		System.out.println(ans);
	}

	@Test
	public void test2() {
		String s = "abcdab";
		StringBuilder ans = findNumOfSeqChar(s);
		System.out.println(ans);
	}

	@Test
	public void test3() {
		String s = "";
		StringBuilder ans = findNumOfSeqChar(s);
		System.out.println(ans);
	}

	@Test
	public void test4() {
		String s = "aaaaaaaa";
		StringBuilder ans = findNumOfSeqChar(s);
		System.out.println(ans);
	}
	private StringBuilder findNumOfSeqChar(String a) {

		int aLength=a.length();
		int currentLength = 1;
		StringBuilder result = new StringBuilder();
		if (aLength > 0) {
	    for (int i = 1; i < aLength; i++) {
	        if (a.charAt(i) == a.charAt(i - 1)) {
	            currentLength++;
	        } else {

				result.append(currentLength >= 1 ? currentLength : "").append(a.charAt(i - 1));
				currentLength = 1;
	        }
	    }


		result.append(currentLength >= 1 ? currentLength : "").append(a.charAt(a.length() - 1));
	   
	}
		return result;
	}
}

