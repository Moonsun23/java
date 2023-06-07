package ex0518;

public class PersonMain {
	public static void main(String[] args) {
		Person p1=new Person(40,"자바");
//		p1.age=1000; -->  set 없이 한다면 이렇게 써서 출력을 해줬지만..나이 같은 경우 터무니없는 나이가 들어가지 않도록 조건을 걸어주듯./.
		p1.setAge(50);
		int a= p1.getAge();
		System.out.println(a);
	}
}		//이러한 코딩을 캡슐화라고 한다. 변수에 직접 접근하는 것을 막기위해
