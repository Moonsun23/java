package day06;

public class TVTest {
	public static void main(String[] args) {
		

		TV myTV= new TV("LG", 2020, 66);

		myTV.showInfo();
//		"우리집 TV는 LG이고 2020년도에 생산되었고"+ "66인치"
		TV myTV2=new TV("Samsung", 1998, 83);
		myTV2.showInfo();
    

		
		
	}
}
