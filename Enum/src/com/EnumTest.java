package com;

public class EnumTest {
	
	public static void main(String[] args) {
		
		Day monday = Day.MONDAY;
		System.out.println(monday);
		
		StatusCode success= StatusCode.SUCCESS;
		System.out.println(success.getcode() + "success");
		
		StatusCode notfound = StatusCode.NOTFOUND;
		System.out.println(notfound.getcode() + "notfound");
	}
}
