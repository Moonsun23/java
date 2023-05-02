package day06;

public class GradeTest {
	public static void main(String[] args) {
		
		Grade myGrade=new Grade(12, 88, 99);
		double avg= myGrade.average(3);
		System.out.println(avg);
		// 아래는 소수점을 2개까지 끊기 위해
		//System.out.println(Math.round(87.5363));
		// 소수점 0.5 아래로는 모두 버림
		// 평균값이 애매하게 나왔을때..
		// 87.5363*100 / 100 --> 해서 87.54로 반올림 되게 만든다..
//		double i = 0;
//		if(i<=0.99) {
//			System.out.println(Math.round(avg)*100/100);
//		}else { 
//			System.out.println(avg*1000/1000);
		
//	}
	}
}
