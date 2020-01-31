import java.awt.Choice;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab9Lists {

	public static void main(String[] args) {
		
		Map<String, Double> str = new TreeMap<>();
		
		Map<String,Double> groceries = new TreeMap<>();
		
		groceries.put("Toaster", 350.00);
		groceries.put("Dongle", 5.99);
		groceries.put("Sham Wow", 19.99);
		groceries.put("Oxy Clean", 19.99);
		groceries.put("Graphics Card", 799.99);
		groceries.put("Power Supply", 80.99);
		groceries.put("CPU", 199.99);
		groceries.put("Monitor", 299.99);		
		
		Scanner scnr = new Scanner(System.in);
		boolean done = false;
		String input;
		double price = 0;
		
		System.out.println("Welcome to Electronics 'R' Us. Everything we have for sale is listen below.");
		showList(groceries);
		System.out.println("What can we get for you today to get started?");
		
		input = scnr.nextLine().toLowerCase();
		str.putAll(findPrice(input, price, groceries));
				
		while (!done) {
			price = 0;
			System.out.println("=========================");
			System.out.println("Your shopping cart so far");
			System.out.println("=========================");
			
			for(String key : str.keySet()) {
				System.out.println(key + " $" + str.get(key));
				price += str.get(key);
			}

			System.out.println("=========================");
			System.out.println("Total so far        " + price);
			System.out.println("=========================");
			
			System.out.println("What would you like to add to your cart, or type \"Done\"");
			input = scnr.nextLine().toLowerCase();
			
			if (input.equals("done")) {
				done = true;
			} else if (!input.equals("toaster") && !input.equals("dongle") && !input.equals("sham wow") && !input.equals("oxy clean") && !input.equals("graphics card") 
					&& !input.equals("power supply") && !input.equals("cpu") && !input.equals("monitor")) {
				System.out.println("Sorry we do not have one of those, try again");
			} else {
				str.putAll(findPrice(input, price, groceries));
			}
			
		}
		System.out.println("Your total for the day is: $" + price);
		System.out.println("Thanks for shopping with us today.");
	}
	
	public static void showList(Map<String, Double> m) {
				
		System.out.println("Item           Price");
		System.out.println("====================");
		for(String key : m.keySet()) {
			System.out.println(key + " $" + m.get(key));
		}
		
	}
	
	public static Map<String, Double> findPrice(String s, double price, Map<String, Double> m) {

		Map<String, Double> price1 = new TreeMap<>();
		
		if (s.equals("toaster")) {
			price1.put("Toaster", m.get("Toaster"));
			
		} else if (s.equals("dongle")) {
			price1.put("Dongle", m.get("Dongle"));
			
		} else if (s.equals("sham wow")) {
			price1.put("Sham Wow", m.get("Sham Wow"));
			
		} else if (s.equals("oxy clean")) {
			price1.put("Oxy Clean", m.get("Oxy Clean"));
			
		} else if (s.equals("graphics card")) {
			price1.put("Graphics Card", m.get("Graphics Card"));
			
		} else if (s.equals("power supply")) {
			price1.put("Power Supply", m.get("Power Supply"));
			
		} else if (s.equals("cpu")) {
			price1.put("CPU", m.get("CPU"));
			
		} else if (s.equals("monitor")) {
			price1.put("Monitor", m.get("Monitor"));
			
		}
		
		return price1;
	}

}
