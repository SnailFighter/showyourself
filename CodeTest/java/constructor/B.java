 class A{
 
 
	public A(){}
	
	public A(String str){
		System.out.println("输出 A");
	}

	static void h(){
		System.out.println("xxxx");
	}

	void t(){
		System.out.println("oppopopopopopopopo");
		h();
	}
	
	static{System.out.println("A static code");}
	{System.out.println("A  code");}
}


public class B{
	public B(){}
	
	public B(String str){
		System.out.println("输出B");
	}
	
	static{System.out.println("B static code");}
	{System.out.println("B  code");}
	
	public void method(){
		System.out.println("输出 B.method()");
	}
	
	public static void main(String[] args){
	
		B b1 = new B();
		B b = new B("haha");
		
		
		b1.method();
		System.err.println(b1);


		A a = new A("AAAAA");
		 // a1 = new A("#$%^&*(");
		a.h();
		A.h();

	}
	
}
