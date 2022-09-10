package java_35;

public class Test {
public static void main(String[] args) {
	MyDate md = new MyDate(15, 2, 2015);
	MyDate md1 = new MyDate(20, 10, 2015);
	MyDate md2 = new MyDate(15, 2, 2015);
	
	System.out.println("md :" +md);
	System.out.println("md1 :" +md1);
	System.out.println("md2 : "+md2);
	
	int  a=5; 
	int b=6;
	if(a==b) {
		System.out.println("a = b");
	}else {
		System.out.println("a khong bang b");
	}
	if(md.equals(md2)) {
		System.out.println("md= md2");
	}else {
		System.out.println("md khac md2");
	}
	
	System.out.println("so sanh md vs md2 : " + md.equals(md2));
	System.out.println("so sanh md vs md1 : " + md.equals(md1));
	
	System.out.println("hashcode cua md la : "+ md.hashCode());
	System.out.println("hashcode cua md1 la : "+ md1.hashCode());	
	System.out.println("hashcode cua md2 la : "+ md2.hashCode());
	
	
}

}
