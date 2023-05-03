package quiz;

public class ColorTV extends TV {

	private int color;
	
	public ColorTV(int size, int color) {
		super(size);		// 부모생성자를 불러서 size를 생성하고
		this.color=color;		// color도 만들어서...
	}
	public void showInfo() {
		System.out.println(this.getSize()+"인치 "+this.color+"컬러");
	}
	public int getColor() {
		return color;
	}
	

	
	
}
