package ncs.test6;

import java.util.Scanner;

public class Calculator {
	/*2부터 5까지의 정수형 데이터만을 키보드로 입력 받아 
	 * 1부터 입력 받은 수까지의 합을 출력 핚
	다. 단, 입력 받은 수가 2부터 5까지의 범위를 벋어나면 
	“입력 값에 오류가 있습니다.”라고 출력
	하고 프로그램을 종료핚다.*/
	
	Scanner sc = new Scanner(System.in);
	public double getSum(int data) throws InvalidException{
	double sum = 0;	
	if(data > 1 && data < 6) {for(int k = 1; k <= data; k++ ) {
		sum += k;
	}System.out.println("결과값 : " + sum);
	} 
	else {
		throw new InvalidException("입력 값에 오류가 있습니다.");
	}
		
	return sum;
	}
	
	
}
