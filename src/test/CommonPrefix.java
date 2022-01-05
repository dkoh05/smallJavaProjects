package test;

public class CommonPrefix {

	static String calcPrefix(String[] strs) {
		String prefix = strs[0]; // init prefix
		if (strs.length == 0) {
			return "";
		}
		for (int i = 0; i < strs.length; i++) {
			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] strs = new String[] { "aaa", "aaa", "" };
		String output = calcPrefix(strs);
		System.out.println(output);

	}

}
