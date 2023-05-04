package quiz;

class Circle01{
	private int x;
	private int y;
	private int radius;
	
	public Circle01(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	@Override
	public boolean equals(Object obj) {			//매개변수를 뭐로 받아야 하는지...// 일단 최상위로 받고
		Circle01 circle=(Circle01)obj;							// 캐스팅을 해준다(업캐스팅/ 다운캐스팅)
		if(circle.x==x && circle.y==y) return true;					// if문이 true로 나왔기 때문에 위에 있는 return의 값이 나온것
		return false;		
	
	
}

// 사진찍은거... 참고..
//public class CircleTest{
	public static void main(String[] args) {
		Circle01 circle01=new Circle01(10,10,100);
		Circle01 circle02=new Circle01(10,23,50);
		if(circle02.equals(circle02)) {
			System.out.println("같은 원입니다.");
		}else {
			System.out.println("다른 원입니다.");
		}
	}
}