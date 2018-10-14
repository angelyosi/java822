package pizza;

public class Program {

	
	public static void main(String[] args) {
		Properties [] pizza=  new Properties [5];
		
		pizza [0]=new Properties(300, 12, 12);
		pizza [1]= new Properties(10, 8, 0);
		pizza [2]= new Properties(10, 8, 4);
		pizza [3]= new Properties(10, 8, 0);
		pizza [4]= new Properties(10, 8, 2);
		
		int sum =0;
		for (int i = 0; i < pizza.length; i++) {
			System.out.println(pizza[i].print());
			sum+=pizza[i].getToppings();
			System.out.println("basic pizza "+ pizza[i].isBasicPizza());
		}
		System.out.println("sum of topping="+sum);
		
			
		}

	
	}


