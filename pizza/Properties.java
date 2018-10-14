package pizza;

public class Properties {
	private int diameter;
	private int slices;
	private int toppings;
	
	
	
	public Properties(int diameter, int slices, int toppings) {
		super();
		if (diameter>=10 && diameter <=50) this.diameter = diameter;
		if (slices>=1 && slices <=8) this.slices = slices;
		if (toppings>=0 && toppings<=5) this.toppings = toppings;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}

	public boolean isBasicPizza () {
		
		return getToppings() == 0;
		
			
			
			
	}
	public String print(){
	return ("diameter=" +getDiameter() +" slices"+getSlices()+" toppings=" + getToppings());
	
	}
	
}
