package day06;

public class Grade { 			// class 2
	// kor, eng, math
	// 평균출력하는 class
//	Grade myGrade= new Grade(60, 80, 70);
//	double myGrade.average();
	
	public double kor;
	public double eng;
	public double math;
	
	public Grade() {
		
	}
	public Grade(double kor, double eng, double math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
	}
	
	public double average(int digit){
//		double num=1;
//		for(int i=0; i<digit; i++) {
//			num=num*10;
//		}
		double num=Math.pow(10, digit); // -> 이렇게 쓸수도 있음
		double avg= Math.round((kor+eng+math)/3*num);
		return avg/num;
		// Math.round -> 반올림.......?
	}
	// 함수의 결과가 있을 때 return의 개념
	
	
	// 이 때 GradeTest의 average에 3을 넣으면 소수점 3자리까지 나옴.
//	void를 쓰면 결과가 없는 것..
	
	
}
