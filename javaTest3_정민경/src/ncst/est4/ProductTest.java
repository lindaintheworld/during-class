package ncst.est4;

import java.util.*;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 입력 : ");
		String name = sc.nextLine();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("수량 입력 : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name, price, quantity);
		
		System.out.println(p.information());
		System.out.println("총 구매 가격 : " + p.getPrice() * p.getQuantity() + " 원");
		
		

	}

}
