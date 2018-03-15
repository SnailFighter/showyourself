

class Hunter {
	public static void main(String[] args){
		Chicken chicken = new Chicken();
		WildGoose goose = new WildGoose();

		System.out.println("I am a hunter,tonight I want to eat some meat,so I decide to shoot some bird!/n");

		System.out.println("peng! peng! peng! ");

		chicken.flys("");

			

		Computer computer = (p)->Integer.valueOf(p);
		Computer computer1 =(p)->1+Integer.valueOf(p);
		int value = computer1.compute("100");
		System.out.println("------computer--------"+value);


		
		int s = computer.compute("2123232");
		System.out.println("------computer--------"+s);

		goose.flys("");

		System.out.println("I get a chicken,but the wild goose flied.Not bad!");

		



	}
}