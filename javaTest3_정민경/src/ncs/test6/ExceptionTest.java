package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		System.out.print("정수 입력 : ");
		int data = new Scanner(System.in).nextInt();
		try {
			test.getSum(data);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
