import java.lang.Cloneable;

class Student implements Cloneable{
	private int number;
	private String name;
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public String getName(){
		return name;
	}
	
	public void setNum(String name){
		this.name = name;
	}
	
	@Override
	public Object clone(){
		
		Student stu = null;
		
		try{
			stu = (Student)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return stu;
	}
	
}


