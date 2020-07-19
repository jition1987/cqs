package cn.cqs.pojo;

public class Test {
 	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		add(a, b);
		System.out.println("a="+a + ",b=" + b);
	}

	private static void add(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
	}
}
