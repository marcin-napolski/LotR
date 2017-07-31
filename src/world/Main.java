package world;

public class Main {

	public static void main(String[] args) {
        
        // static fields can be used without specific class instance
        System.out.println(Ring.numberOfRings);
        Ring narya = new Ring("Narya");
        System.out.println(Ring.numberOfRings); 

	}

}
