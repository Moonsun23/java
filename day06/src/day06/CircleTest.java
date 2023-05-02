package day06;

public class CircleTest {		//
	public static void main(String[] args) {
		
		// 비즈니스 로직
		// 리모콘(11)=mbc
		// 리모콘(33)=ocn
		
		Circle gong=new Circle(30, "축구공");
		System.out.println(gong.name+"의 넓이는 "+gong.getArea()+"입니다.");
		
		Circle circle = new Circle();			// 앞의 설명서를 구체화 시키기 위해 new를 쓴다...
		circle.name="써클";
		circle.radius=10;
		
		Circle circle02=new Circle(17);
		circle02.name="써클02";
		
		System.out.println(circle.name+"의 넓이는 "+circle.getArea()+"입니다.");
		
		Circle pizza=new Circle();
		pizza.name="도미노피자";
		pizza.radius=25;
		System.out.println(pizza.name+"의 넓이는 "+pizza.getArea()+"입니다.");
		
		// 던킨도넛
		
		Circle donut= new Circle();
		donut.name="던킨도넛";
		donut.radius=5;
		System.out.println(donut.name+"의 넓이는 "+donut.getArea()+"입니다.");
		
	}
}
