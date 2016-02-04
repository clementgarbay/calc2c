package test;

public class TestRed extends Test {
	/**
	 * Entry point. Executes all the red tests. 
	 * 
	 * @param args
	 */	
	public static void main(String[] args){	
		boolean verbose = true;

		test(verbose, PATH + "red1.calc", "one constant function", "2");
		test(verbose, PATH + "red2.calc", "one constant function, one call", "2");
		test(verbose, PATH + "red3.calc", "two constant functions and calls", "5");
		test(verbose, PATH + "red4.calc", "two constant functions and nested calls", "3");
		test(verbose, PATH + "red5.calc", "function and call with a parameter", "11");
		test(verbose, PATH + "red6.calc", "call with a composed expression", "12");
		test(verbose, PATH + "red10.calc", "mutually recursive functions", "1");
		test(verbose, PATH + "red11.calc", "function test1 not found", "error");

		report();
	}
}
