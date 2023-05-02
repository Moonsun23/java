package day06;

public class Book { // 생성자함수(new를 통해 딱 한번만 만들어쓸 수 있게 호출이 되는 것) void(return type???)이 뜨지않음.
	// 제목, 작자
	public String title;			// 외부로 노출시킬 일이 있다면 public/ 내부적으로 쓴다면 private
	public String author;
	
	public Book() {						// 생성자는 private은 안된다.
		title ="";						// 여기 지정된 매개변수가 없을 경우에는 untitle 항목에서 null 이라고 뜬다.
		author="";						// 
		
	//	this("","");     위와 동일하게 	-->> this를 활용해 나 자신을 함수로 호출해서 쓸 수 있다.(아래예시)
	}
	
	//위 처럼 아무것도 없는 빈 생성자 함수라도 만들어줘야 진행이 된다.
	// 아무것도 지정되지 않은 것을 출력하려면 빈생성사를 만들어줘야 한다.
	// 코드가 정해져 있어야 뭐라도 호출하는거니까!!!!!
	
	
//	public Book() {
//		this("untitled", "nonamed");  --->>> 이렇게도 쓸 수 있다.
//	}
	
	
	public Book(String t) {
		title = t;
		author= "작자미상";
		
		//만약 title의 String t를 t가 아닌 title로 바꾸고 싶다면
		// this.title= title; (나 자신을 의미하는 this.를 붙여준다)
		// this. 는 맨 위에 지정된 이름과 동일하다는 것을 알릴 때 쓴다.
	}
	public Book(String t, String a) {
	title=t;
	author=a;
}
	public void showInfo() {
		System.out.println("제목 : "+title+", 작가는 "+author);
	}

}
