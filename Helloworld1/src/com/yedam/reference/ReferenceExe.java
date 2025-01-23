package com.yedam.reference;

import com.yedam.reference.ReferenceExe1;

public class ReferenceExe {
	public static void main(String[] args) {
		ReferenceExe1 ref1;
		ref1 = new ReferenceExe1();
		
		ref1.method1(); //public 다른 클래스에서 사용가능 
//		ref1.method2(); //private 다른 클래스에서 사용불가능
	}
}


