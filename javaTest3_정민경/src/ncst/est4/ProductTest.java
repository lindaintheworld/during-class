package ncst.est4;

import java.util.*;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ �Է� : ");
		String name = sc.nextLine();
		System.out.print("���� �Է� : ");
		int price = sc.nextInt();
		System.out.print("���� �Է� : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.println(p.information());
		System.out.println("�� ���� ���� : " + p.getPrice() * p.getQuantity() + " ��");
		
		

	}

}
