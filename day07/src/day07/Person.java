package day07;

public class Person {				//디폴트 프라이빗 퍼블릭 프로텍티드 예제
	private int weight;		// 프라이빗은 막혀있어서 외부로 나갈수 있는 메소드를 만들어줘야함
	int age;				// 디폴트
	public String name;
	protected int height;
	
	public int getWeight() {		// Source - generate getters and setters 를 통해 자동으로 만들어주기도 한다
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
//	public void setWeight(int weight) {
//		this.weight = weight;
//		
//	}
//	
//	public int getWeight() {
//		return weight;							//this.weight를 써도 됨
//	}

}
