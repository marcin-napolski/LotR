package world;

public class Ring {
    public static short numberOfRings;
    private String name;
    
	public Ring(String nm) {
		this.setName(nm);
		this.addRing();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void addRing() {
		numberOfRings++;
	}
	
	
}
