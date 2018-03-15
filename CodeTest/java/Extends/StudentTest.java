import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


class StudentTest{
	public static void main(String[] args){
		Student stu = new Student();
		stu.setName("XXXXXX");
		System.out.println(stu.getName());



		Student stu1 = new Student();
		stu1.setName("111");

		Student stu2 = new Student();
		stu2.setName("111");


		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu1);
		if(!list.contains(stu2)){
			list.add(stu2);
		}

		for(Student p :list){
			System.out.println(p.getName());
		}


		Set<Stutent> set = new HashSet<Student>();
		set.add(stu1);
		set.add(stu2);
		for(){
			
		}

	}
}