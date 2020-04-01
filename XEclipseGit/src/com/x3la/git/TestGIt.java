package com.x3la.git;

public class TestGIt {

	public static void main(String[] args) {
		String[] names = {"Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.format("%s - Hello, %s \n", String.valueOf(i), names[i]);
		}
	}
}
