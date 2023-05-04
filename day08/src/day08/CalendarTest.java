package day08;

import java.text.SimpleDateFormat;			// text에 있는 ...simpledateformat
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		
		
		Calendar now=Calendar.getInstance();		//추상클래스여서 new를 할 수가 없다.....!
		int year=now.get(Calendar.YEAR);		// 상수이기 때문에 컴퓨터에서 정해져있어서 알아서 값을 구해준다.
		int month=now.get(Calendar.MONTH);
		int day=now.get(Calendar.DAY_OF_WEEK); 		// 추가 2 - 요일
		int date=now.get(Calendar.DAY_OF_MONTH);	// 추가 3 - 날짜
		
		int hourOfDay= now.get(Calendar.HOUR_OF_DAY);
		int hour= now.get(Calendar.HOUR);	// 
		int ampm=now.get(Calendar.AM_PM);
		
		int min= now.get(Calendar.MINUTE);
		int sec= now.get(Calendar.SECOND);
		
		
		System.out.println(ampm==0? "오전":"오후"+"==="+hour+"==="+hourOfDay+"==="+min+"==="+sec);		// 24시간제/ 12시간제 로 표시하는 것
		//참이면 앞에 것, 거짓이면 뒤에 것..ampm.
		// 오후 2시 // 14시 40분 10초를 지나고 있다....(현재시각은 정해진 상수에서 가져오기 때문에 현시각 반영)
		
		System.out.println(day);					// 추가 2-1
		System.out.println(date);
		System.out.println(now.getTime()); 				// getTime을 하면 date라는 객체를 return해준다..
		SimpleDateFormat dateFormat= new SimpleDateFormat("YYYY/MM/dd - HH:MM:ss");	// DD를 써주면 현재 1년 중 며칠째인지 나와서 소문자로 바꿔야함
		
		System.out.println(dateFormat.format(now.getTime()));
		
		
		// 추가1
		String monthArray[]= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String dayArray[]= {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		
		System.out.println(year+"/"+month);			// 이대로면 2023/4 로 뜸...// 나라마다 월/요일 등 표기방법이 다르기 때문에..
		System.out.println(year+"/"+monthArray[month]);		// 2023/May로 뜸
		
		System.out.println(year+"/"+monthArray[month]+"/"+date+"/"+dayArray[day-1]);
		// 시작이 0부터니까 1을 빼서 요일 맞춰야 함..........
		
		
		
	}
}
