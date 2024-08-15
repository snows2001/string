package com.momo;

public class EX02_StringBuffer {
	public static void main(String[] args) {
		String str = "A";
		System.out.println(str.hashCode());
		
		str += "BC"; // 또 다른 스트링 객체가 만들어진다.
		System.out.println(str.hashCode()); 

		
		StringBuffer str2 = new StringBuffer("L");
		System.out.println(str2.hashCode());
		
		str2.append("MN");
		System.out.println(str2.hashCode());
		
		StringBuilder str3 = new StringBuilder("X");
		System.out.println(str3.hashCode());
		
		str3.append("YZ");
		System.out.println(str3.hashCode());

			
		//해당 문자열이 자주 수정되는 경우 
		//StringBuffer, StringBuilder를 이용하면 
		//저장공간을 좀 더 효율적으로 활용 할 수 있다. 
	}
}
