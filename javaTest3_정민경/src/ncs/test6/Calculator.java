package ncs.test6;

import java.util.Scanner;

public class Calculator {
	/*2���� 5������ ������ �����͸��� Ű����� �Է� �޾� 
	 * 1���� �Է� ���� �������� ���� ��� ��
	��. ��, �Է� ���� ���� 2���� 5������ ������ ����� 
	���Է� ���� ������ �ֽ��ϴ�.����� ���
	�ϰ� ���α׷��� ��������.*/
	
	Scanner sc = new Scanner(System.in);
	public double getSum(int data) throws InvalidException{
	double sum = 0;	
	if(data > 1 && data < 6) {for(int k = 1; k <= data; k++ ) {
		sum += k;
	}System.out.println("����� : " + sum);
	} 
	else {
		throw new InvalidException("�Է� ���� ������ �ֽ��ϴ�.");
	}
		
	return sum;
	}
	
	
}
