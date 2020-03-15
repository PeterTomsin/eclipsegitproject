package com.array.test;

public class TestSystem {
	
	private int num;
	private char testchar;
	
	
	@Override
	public String toString() {
		return "TestSystem [num=" + num + ", testchar=" + testchar + "]";
	}

	
	
   public static void main(String[] args) {
	 TestSystem system = new TestSystem();
	 System.out.print(system.toString());
		/*
		 * System.getProperties().list(System.out);
		 * System.out.println(System.getProperty("user.name"));
		 * System.out.println(System.getProperty("java.library.path"));
		 */
  }
}
