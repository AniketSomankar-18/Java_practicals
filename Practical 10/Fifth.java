class Human{
	void move(){
		System.out.println("Human is Moving");
	}
	
	void eat(){
		System.out.println("Human is Eating");
	}
}

class Boy extends Human{
	void move(){
		System.out.println("Boy is Moving");
	}
	
	void eat(){
		System.out.println("Boy is Eating");
	}
	
	public static void main(String[] args){
		Boy boy1 = new Boy();
		boy1.move();
		boy1.eat();
	}
}
