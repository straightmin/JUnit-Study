package test.java;

public class Substring {
	
	public String sub(String message) {
		int start = message.indexOf("(");
		int end = message.indexOf(")");
		
		String result = message.substring(start + 1, end);
		return result;
	}

}
