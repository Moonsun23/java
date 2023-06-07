package ex0518;

import java.util.Date;

public class ImportMain {
	public static void main(String[] args) {
		Date d=new Date();
//		java.util.Date d= new java.util.Date();
//		java.util.Date d1= new java.util.Date();
//		java.util.Date d2= new java.util.Date();
//		java.util.Date d3= new java.util.Date();
		System.out.println(d.getDate());
		System.out.println(d.toString()); //시스템이 가지고 있는 현재 시간
	}
}
