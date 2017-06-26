//反射测试

import java.lang.Class;
import java.lang.reflect.Constructor;

import java.lang.reflect.Field;

public class ReflectTest{

	public static void main(String[] args){
	
	//获取Test类名称
	Class object  = Test.class;
	/*
	try{
		Class obj = Class.forName("Test.class");
		System.out.println("类全路径名为：  "+obj.getName());
	}catch(ClassNotFoundException e){
		System.out.println("找不到反射的类/r/n"+e.getMessage());
		
	}
	*/
	
	System.out.println("类名称为：   "+object.getName());
	
	Constructor[] constructors = object.getConstructors();
	for(Constructor c:constructors){
		System.out.println("类构造器名称为：   "+c.getName());
		Class[] params = c.getParameterTypes();
		for(int i=0;i<params.length;i++)
			System.out.println("类构造器参数类型名称为：   "+params[i].getName());
		}
		
		
		
	//获取变量名称
	
	Field[] fields = object.getFields();
	for(int i=0;i<fields.length;i++){
		System.out.println("类变量名称为：   "+fields[i].getName());   //之获取了public变量
	}
		
		
		
	}
	
	
	
		
	
}
