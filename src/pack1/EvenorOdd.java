package pack1;

import java.util.Scanner;

public class EvenorOdd {
	Scanner sc = new Scanner(System.in);

	public void meth1() {
		System.out.println("enter num:");
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("even num");
		} else {
			System.out.println("odd num");
		}
	}

	public void meth2(int x) {
		if (x % 2 == 0) {
			System.out.println("num is even");
		} else {
			System.out.println("num is odd");
		}
	}

	public static void main(String[] args) {
		EvenorOdd obj = new EvenorOdd();
		obj.meth1();
		System.out.println("-----------");
		obj.meth2(5);

	}

}
