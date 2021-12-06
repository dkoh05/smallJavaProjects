package test;

public class LastWordLen {
	
	static int calcLen(String s) {
		int count = 0;
		String ns = s.trim();
		for(int i = ns.length()-1;i>=0;i--) {
			if(ns.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "luffy is still joyboy";
		int output = calcLen(s);
		System.out.println(output);

	}

}
