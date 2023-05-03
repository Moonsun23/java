package quiz;

public class TV { // point/colorpoint랑 비슷
// TV라는 class를 만든다.
	// size라는 속성을 가진다.
	// 생성자는 size를 정할 수 있다.
	
	// ColorTV를 만들고 TV를 상속받는다.
	// color라는 속성을 가진다.
	// showInfo를 통해(66인치 1024컬러) 를 출력한다.
	
	private int size;				// 속성은 웬만하면 private으로
	
	public TV(int size) {
		this.size=size;
	}
	public int getSize() {			// size는 이미 int size로 정해졌으니까 get만 함
		return size;
	}
	
	/*
	 * 속성 private int size;
	 * 
	 * 생성자 함수
	 * public TV(int size){
	 * this.size=size;
	 * }
	 * public int getSize(){
	 * return size;
	 * }
	 */
	
	
	
}
