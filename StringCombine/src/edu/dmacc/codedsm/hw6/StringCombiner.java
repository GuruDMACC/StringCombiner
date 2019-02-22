package edu.dmacc.codedsm.hw6;

import java.util.Calendar;

public class StringCombiner {

	public static void main(String[] args) {
		String s1 = "current";
		String s2 = "date";

		String res = concat1tring(s1, s2);

		String res2 = returntodaydate();

		finalrun(res, res2);
	}

	private static void finalrun(String res, String res2) {
		System.out.println(res + " " + res2);

	}

	private static String returntodaydate() {
		String mydate = java.text.DateFormat.getDateTimeInstance().format(
				Calendar.getInstance().getTime());
		;
		return mydate;
	}

	private static String concat1tring(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1 + " " + s2;
	}

}