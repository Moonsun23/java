package ex0518;

public class Person {
	private int age;
	String name;
	
	Person(int age, String name){
		this.age=age;
		this.name=name;
		
	}
	// 메서드에 private을 붙이는 경우는 거의 없다.
	public void setAge(int age) { //  변수에 값을 저장(대입) 목적으로 붙여주는 것이 set. set 뒤에 변수이름 첫글자를 대문자로.
		 if(age >0 && age<=150) {
			 this.age=age; 	// 
		 }
	}
	public int getAge() {
		// 나이를 가져올 것(get)이기 때문에 return  타입이 있음
		return age;
	}
}
