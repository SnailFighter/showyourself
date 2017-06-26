class A {
	public void method(){
		System.out.println("==================A");
	}
}

class B extends A {
	public void method(){
		System.out.println("====================B");
	}
}


//运行结果，   首先不报错，输出===================B
public class C {
	public static void main(String[] args){
		A a  = (A) new B();  //向上转型
		a.method();
		
		B b = (B)a;//向下转型
		b.method();//  正确编译输出=======================B
			
		
		B b1  = new A();//向下转型2      编译错误 ： 错误: 不兼容的类型: A无法转换为B
		b1.method();
		
		
	}

}
