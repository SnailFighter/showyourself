
class Printer {
	public static void main(String[] args){
		PrinterA a = new PrinterA();
		a.printInfo("TEST CONTENT");

		PrinterB b = new PrinterB();
		b.printInfo("TEST CONTENT");

		PrinterC c = new PrinterC();
		c.printInfo("TEST CONTENT");


		a.printDefault();
		b.printDefault();
		c.printDefault();

		a.printDefault1();
		b.printDefault1();
		c.printDefault1();
	}
}




class PrinterA implements printInfo {
	
	public void printInfo(String content){
		System.out.println("----PrinterA write some content---->"+content);
	}
}

class PrinterB implements printInfo {
	
	public void printInfo(String content){
		System.out.println("----PrinterB write some content---->"+content);
	}
}

class PrinterC implements printInfo {
	
	public void printInfo(String content){
		System.out.println("----PrinterC write some content---->"+content);
	}
}

