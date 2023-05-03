package day06;

public class TV {	// class 5
	// company, year, size
	// showInfo()라는 메소드를 통해 제품 정보를 출력
	
	public String company;
	public int year;
	public int size;
	
	public TV() {
		
	}
	public TV(String c, int y, int s) {
		company=c;
		year=y;
		size=s;
	}
	public void showInfo() {
		System.out.println("우리집 TV는 "+company+"이고 "+year+"년도에 생산되었고 "+ size+""
				+ "인치 입니다.");
	}
	
}
