package races;

public class Main {

	public static void main(String[] args) {
		// this part is just to demonstrate how the constructors are called by object initialization
		Man aragorn = new Man();
		Elf legolas = new Elf();
		Dwarf gimli = new Dwarf();
		
		// an example of polymorphism - more specific object type assigned to a variable of more general reference type
        	Orc grishnákh = new UrukHai();
        	grishnákh.fight();
        	//grishnákh.setFire(); -- THIS WILL NOT WORK! method undefined for Orc
        	((UrukHai)grishnákh).setFire(); // casting variable type -- THIS WILL WORK NOW!
		
		// setting age of Legolas
		legolas.setAge((short) 501);
		System.out.println(legolas.getAge());

	}

}
