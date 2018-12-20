package ncs.test3;


import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		
		Calendar birth = new GregorianCalendar(1987, 04, 27);
		Calendar today = new GregorianCalendar();
		
		int year = birth.get(Calendar.YEAR);
		int date = birth.get(Calendar.DAY_OF_WEEK);		
		int todayYear = today.get(Calendar.YEAR);
		
		String yoil = null;
		
		switch(date){
		case 1 : yoil = "�Ͽ���"; break;
		case 2 : yoil = "������"; break;
		case 3 : yoil = "ȭ����"; break;
		case 4 : yoil = "������"; break;
		case 5 : yoil = "�����"; break;
		case 6 : yoil = "�ݿ���"; break;
		case 7 : yoil = "�����"; break;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'��' MM'��' dd'��'");
		
		
		System.out.println("���� : " + sdf.format(birth.getTime()) + " "+ yoil);
		System.out.println("���� : " + sdf.format(today.getTime()));
		System.out.println("���� : " + (todayYear - year) + "��");
	
				

	}

}
