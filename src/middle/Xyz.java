package middle;

public class Xyz {

	//static variable
	
	public static int speed=345;
   public static char mysize='L';
	
	//non static variable
	
	String myMessage =  "reading is good";
	
	
	public static void main(String[] args) {
		System.out.println(Xyz.speed);
        System.out.println(Xyz.mysize);
		
		
		Xyz truck=new Xyz();
		System.out.println(truck.myMessage);
		
	}


}