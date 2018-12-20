package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		
		String[] st = str.split(",");
		//for~each문을 사용한다.
		/*for(int j = 0; j < data.length; j++) {
			data[j] = Double.parseDouble(st[j]);
			sum += data[j];
		}*/
		int index=0;
		for(double d:data) {
			d=Double.parseDouble(st[index]);
			sum+=d;
			index++;
		}
		
		System.out.println("합계 : " + ((int)(sum * 1000))/1000.0); //소수점 3자리까지만
		System.out.printf("합계 : %.3f\n", sum);
		System.out.println("평균 : " + sum / data.length);
	}

	
}
