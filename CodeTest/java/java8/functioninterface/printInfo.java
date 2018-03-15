interface printInfo {
	default void printDefault(){
		System.out.println("print some default content");
	}

	default void printDefault1(){
		System.out.println("print some default content ******");
	}

	void printInfo(String content);
}