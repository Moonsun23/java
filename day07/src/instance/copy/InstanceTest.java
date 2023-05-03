package instance.copy; 				// instanceof 예제..

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Person{}
class StudentWorker extends Student{}
	

// 생성자 오버로드
// 메서드 오버로드
// 메서드 오버라이드: 부모한테 메서드가 정해져있는데 자식은 물려받은 부모의 기능을 업그레이드 하고싶어서 그 위에 덮어씌우는 것


public class InstanceTest {
	
	static void print(Person person) {
		if(person instanceof Person) System.out.println("Person입니다.");
		if(person instanceof Student) System.out.println("Student입니다.");
		if(person instanceof Researcher) System.out.println("Researcher입니다.");
		if(person instanceof Professor) System.out.println("Professor입니다.");
	}
	
	
	public static void main(String[] args) {
		print(new Student());					// student는 사람인 동시에 학생이므로 결과가 person입니다. student 입니다. 라고 두 문장이 뜬다.
		// 교수는 사람, 연구자도 될 수 있으므로 3개 문장이 뜬다.
		
	}
}
