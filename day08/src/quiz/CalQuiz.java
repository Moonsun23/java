package quiz;
// 내가 작성한 답변	--> 정답은 GoodMorningTest 클래스로 ㄱ
/*
 * 2. 현재 시간을 출력하는데 15시 15분
6~11 goodmorning 
12~17 goodafternoon
18~21 goodevening
22~    good night
 */
import java.util.Calendar;

public class CalQuiz {


	public static void main(String[] args) {
		
		Calendar now=Calendar.getInstance();		//추상클래스여서 new를 할 수가 없다.....!
		int year=now.get(Calendar.YEAR);		// 상수이기 때문에 컴퓨터에서 정해져있어서 알아서 값을 구해준다.
		int month=now.get(Calendar.MONTH);
		int day=now.get(Calendar.DAY_OF_WEEK); 		// 추가 2 - 요일
		int date=now.get(Calendar.DAY_OF_MONTH);// 추가 3 - 날짜
		int min= now.get(Calendar.MINUTE);
		
		int hourOfDay= now.get(Calendar.HOUR_OF_DAY);
		
		
//		int hourOfDayArray[]=
//		String greetArray[]= {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
		
	//	System.out.println("현재 시각은 "+);
	}
	
	
	
}
