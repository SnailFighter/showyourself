public class Pig{

	private String type;
	
	private int age;
	
	private int sex = 0;
	
	private double weight;
	
	public Pig(){}
	
	public Pig(String type){
		this.type = type;
	}
	
	public Pig(String type,int age,int sex,double weight){
		this.type = type;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setSex(int sex){
		this.sex = sex;
	}
	
	public int getSex(){
		return sex;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public String toString(){
		return "type:"+type+"  age:"+age+"  sex:"+sex+"  weight:"+weight;
		
	}
}