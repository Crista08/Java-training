class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		System.out.println(str.substring(0,4));
		System.out.println(str.subSequence(0,4));
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("World","java"));
		System.out.println(str.replaceFirst("o","@"));
		System.out.println(str.replaceAll("o","@"));
		System.out.println("     abcd      ".trim());
		System.out.println(str.charAt(4));
		String str1="qwerty";
		System.out.println();
		int k=2;
		k=k%str1.length();
		String rotated=str1.substring(k)+str1.substring(0,k);
		System.out.println(rotated);
		String str2="programming";
		if (str.length() < 2) {
			System.out.println(str);
			return;
			}
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		String middle = str.substring(1, str.length() - 1);
		String swapped = last + middle + first;
		System.out.println(swapped);
	}

}
