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
		case 1 : yoil = "일요일"; break;
		case 2 : yoil = "월요일"; break;
		case 3 : yoil = "화요일"; break;
		case 4 : yoil = "수요일"; break;
		case 5 : yoil = "목요일"; break;
		case 6 : yoil = "금요일"; break;
		case 7 : yoil = "토요일"; break;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy'년' MM'월' dd'일'");
		
		
		System.out.println("생일 : " + sdf.format(birth.getTime()) + " "+ yoil);
		System.out.println("현재 : " + sdf.format(today.getTime()));
		System.out.println("나이 : " + (todayYear - year) + "세");
	
				

	}

}
