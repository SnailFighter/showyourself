public class Test{
	public static void main(String args[]){
		Student stu1 = new Student();
		stu1.setNumber(1234);
		stu1.setName("zhang laosan");
		Student stu2 =(Student)stu1.clone();
		
		System.out.println("student1 "+stu1.getNumber());
		System.out.println("student2 "+stu2.getNumber());
		
		stu2.setNumber(78910);
		stu1.setName("wang laosi");
		System.out.println("student1 "+stu1.getNumber());
		System.out.println("student2 "+stu2.getNumber());
	}
}