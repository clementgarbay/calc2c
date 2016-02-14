package test;

public class TestGreen extends Test {

    /**
	 * Entry point. Executes all the tests. 
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		boolean verbose = true;

        test(verbose, PATH + "green1.calc", "number", "1234567890");
        test(verbose, PATH + "green2.calc", "addition", "2");
		test(verbose, PATH + "green3.calc", "arithmetic expression with priority", "7");
		test(verbose, PATH + "green4.calc", "unary minus", "-4");
		test(verbose, PATH + "green5.calc", "boolean", "0");
		test(verbose, PATH + "green6.calc", "boolean expression", "1");
		test(verbose, PATH + "green7.calc", "boolean expression with priority", "1");
		test(verbose, PATH + "green8.calc", "boolean expression with explicit priority", "0");
		test(verbose, PATH + "green9.calc", "unary not", "1");
		test(verbose, PATH + "green10.calc", "conditional", "12");
		test(verbose, PATH + "green11.calc", "conditional", "21");
		test(verbose, PATH + "green12.calc", "comparison", "1");
		test(verbose, PATH + "green13.calc", "nested conditionals", "2");
		test(verbose, PATH + "green14.calc", "unequality", "1");
		test(verbose, PATH + "green15.calc", "equality", "0");
		test(verbose, PATH + "green16.calc", "equality", "error");
		test(verbose, PATH + "green17.calc", "nested divisisons", "1");
		test(verbose, PATH + "green18.calc", "minus mix", "2");
		test(verbose, PATH + "green19.calc", "parenthesized number", "2");
		test(verbose, PATH + "green20.calc", "erroneous expression", "error");
		test(verbose, PATH + "green21.calc", "garbage", "error");
		test(verbose, PATH + "green22.calc", "garbage", "error");
		test(verbose, PATH + "green23.calc", "erroneous conditional", "error");
		test(verbose, PATH + "green24.calc", "erroneous conditional/garbage", "error");
		test(verbose, PATH + "green25.calc", "division by zero", "error");
		test(verbose, PATH + "green26.calc", "division by zero", "error");
		test(verbose, PATH + "green27.calc", "erroneous number", "error");

		report();
	}
}
