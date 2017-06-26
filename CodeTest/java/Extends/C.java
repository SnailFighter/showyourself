
//验证子类与父类初始化顺序
//同一个文件中只能又一个public 类

 class A {
	public A(){
		System.out.println("初始化A");
	}
}

 class B extends A{
	public B(){
		System.out.println("初始化B");
	}
}


//运行输出结果为：
//初始化A
//初始化B
//说明父类先被初始化
public class C {
	public static void main(String[] args){
		B b  = new B();
	}
}
