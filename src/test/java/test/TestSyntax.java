package test;

import ccalc.CCalc;

public class TestSyntax {
	static int count = 0;
	static int success = 0;
	
	public static void report(){
		System.out.println(success + " successful tests out of " + count);
	}

	public static void test(String filename, boolean wellFormed) {
		String[] args0 = new String[1];
		args0[0] = filename;
		System.out.println("====: " + filename);
		try {		
			count++;
			CCalc.main(args0);
			if (wellFormed) success++;
			else System.err.println("FAILURE");
		} catch(Exception e){
			if (!wellFormed) success++;
			else System.err.println("FAILURE");
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
        final String PATH = "src/test/resources/";

        /*test(PATH + "green1.calc", true);
		test(PATH + "green2.calc", true);
		test(PATH + "green3.calc", true);
		test(PATH + "green4.calc", true);
		test(PATH + "green5.calc", true);
		test(PATH + "green6.calc", true);
		test(PATH + "green7.calc", true);
		test(PATH + "green8.calc", true);
		test(PATH + "green9.calc", true);
		test(PATH + "green10.calc", true);
		test(PATH + "green11.calc", true);
		test(PATH + "green12.calc", true);
		test(PATH + "green13.calc", true);
		test(PATH + "green14.calc", true);
		test(PATH + "green15.calc", true);
		test(PATH + "green16.calc", true);
		test(PATH + "green17.calc", true);
		test(PATH + "green18.calc", true);
		test(PATH + "green19.calc", true);
		test(PATH + "green21.calc", false);
		test(PATH + "green22.calc", false);
		test(PATH + "green23.calc", false);
		test(PATH + "green24.calc", false);
		test(PATH + "green25.calc", true);
		test(PATH + "green26.calc", true);
		test(PATH + "green27.calc", false);*/
		
//		test(PATH + "blue1.calc", true);
//		test(PATH + "blue2.calc", true);
//		test(PATH + "blue3.calc", true);
//		test(PATH + "blue4.calc", true);
		test(PATH + "blue5.calc", true);
		test(PATH + "blue6.calc", true);
		test(PATH + "blue7.calc", true);
//		test(PATH + "blue8.calc", false);
		
//		test(PATH + "red1.calc", true);
//		test(PATH + "red2.calc", true);
//		test(PATH + "red3.calc", true);
//		test(PATH + "red4.calc", true);
//		test(PATH + "red5.calc", true);
//		test(PATH + "red6.calc", true);
//		test(PATH + "red10.calc", true);

		report();
	}
}

