public class Person{
	private String name;
	
	private int age;

	
	public String getName(){
		return name;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	
	//has no  private field method
	public void run(int length){
		System.out.println("I'm walking"+length+"KM");
	}
}