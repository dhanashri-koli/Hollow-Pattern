package com.testing;

public class Demo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 10 || j == 1 || i == j)
					System.out.print("@ ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
