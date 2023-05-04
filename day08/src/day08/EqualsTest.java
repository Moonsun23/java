package day08;

//Rect라는 class를 만든다. width, height equals의 조건을 면적이 같으면 같은 Rect로 인정한다.


	

class Point02{
	private int x,y;
	public Point02(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	
	public boolean equals(Object obj) {			//매개변수를 뭐로 받아야 하는지...// 일단 최상위로 받고
		Point02 point=(Point02)obj;							// 캐스팅을 해준다(업캐스팅/ 다운캐스팅)
		if(x==point.x && y==point.y) {
			return true;					// if문이 true로 나왔기 때문에 위에 있는 return의 값이 나온것
		}
		return false;						// 만약 if문이 거짓이었다면 아래 false가 나왔을것
	}
	
}
public class EqualsTest {
	public static void main(String[] args) {
		
		
		
		
		
		/*
		Point02 pointA=new Point02(10,10);
		Point02 pointB=new Point02(10,10);			// new로 작성되는 순간부터 다른 값이 된다.
		Point02 pointC=pointA;
		System.out.println(pointA==pointB);			// false
		System.out.println(pointA==pointC);			// true
		System.out.println(pointA.equals(pointB));			//내가 메서드를 만들어서 쓸 수 있어서 조건을 바꿀수 있다.
		System.out.println(pointA.equals(pointC));			//위 sysout 2개와 아래 sysout 두개 결과는 원래 같았지만
		// 위에 equals를 쓰면서 결과는 f/t/t/t 가 되었다.
		 * 
		 */
		
//		Rect rect 01= new Rect(10,10); (quiz)
//		Rect rect 02= new Rect(50,2);
//		System.out.println(rect01.equals(rect02));
	}
}
