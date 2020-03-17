package Test04;

import java.util.Scanner;

public class Test {
	private double a;
	private double b;
	private String operate;
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void add(double a,double b) {
		System.out.println(a+"+"+b+"="+(a+b));
		
	}
	public void subtract(double a,double b) {
		System.out.println(a+"-"+b+"="+(a-b));
		
	}
	public void multiply(double a,double b) {
		System.out.println(a+"*"+b+"="+a*b);
		
	}
	public void divide(double a,double b) {		
		if(Double.isInfinite(a/b)) {
			System.out.println("您输入的式子有误");
		}else {
			System.out.println(a+"/"+b+"="+a/b);
		}	
	}
	
	/*
	 * 测试
	 */
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("欢迎使用xxx计算器"
				+ "\n本计算器支持加减乘除");
		boolean b = true;
		Scanner sc=null;
		while(b) {
			System.out.println("请输入您要计算的算式");
			sc = new Scanner(System.in);
			try {
				t.setA(sc.nextDouble());
				t.setOperate(sc.next());
				t.setB(sc.nextDouble());
			} catch (Exception e) {
				System.out.println("您输入的式子有误");
				continue;
			}
			
			switch (t.getOperate()) {
			case "+":
				t.add(t.getA(), t.getB());
				break;
			case "-":
				t.subtract(t.getA(), t.getB());
				break;
			case "*":
				t.multiply(t.getA(), t.getB());
				break;
			case "/":
				t.divide(t.getA(), t.getB());
				break;
			default:
				System.out.println("您输入的式子有误");
				break;
			}
			
			System.out.println("是否继续计算?(y/n)");
			b=sc.next().equals("y")?true:false;
		}
		sc.close();
		System.out.println("欢迎下次使用！");
	}
}
