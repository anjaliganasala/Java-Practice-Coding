package com;

public enum StatusCode {

	SUCCESS(200), NOTFOUND(404), BADREQUEST(400); // enums are by default - public static final , we cant change it 
	
	int code;
	
	private StatusCode(int code) {
		this.code = code;
	}
	
	public int getcode() {
		return code;
	}
}
