package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {

	Scanner scan = new Scanner(System.in);

	//		key -> Product id and value -> product Object
	Map<Integer, Product> db = new LinkedHashMap<Integer, Product>();

	int totalBill = 0;

	public void addProduct()
	{
		db.put(1, new Product("KitKat", 20, 15));
		db.put(2, new Product("Dairymilk", 15, 10));
		db.put(3, new Product("IceCream", 5, 30));
	}

	public void displayProduct()
	{
		Set<Integer> keys = db.keySet();

		for(int key : keys)
		{
			Product p = db.get(key);		//getting product based on key
			System.out.println("Enter "+key+" to order "+p.getName());
			System.out.println("Available Quantity : "+p.getQuantity());
			System.out.println("Cost : "+p.getCost());
			System.out.println("------------------------------------------------");
		}

	}

	public void buyProduct()
	{
		System.out.println("Enter Choice");		//choice => key
		int choice = scan.nextInt();	//1

		Product p =db.get(choice);		//Product p = KitKat object

		if(p!=null)
		{
			System.out.println("Enter quantity");

			int quantity = scan.nextInt();		//2

			if(quantity <= p.getQuantity())		//2<=20
			{
				//1. Calculating current product cost
				int productCost = quantity*p.getCost();

				//2. Updating new Quantity
				p.setQuantity(p.getQuantity() - quantity );

				//3. Adding current Product cost to the total bill
				totalBill = totalBill + productCost;

				System.out.println("Purchased "+quantity+" "+p.getName());
				System.out.println("Current Product Cost is Rs: "+productCost);
				System.out.println("Total bill as of now : Rs."+totalBill);

			}
			
		}

	}

	public void ckeckOut()
	{
		System.out.println("Thank you for Shopping!");
		System.out.println("Your Total Bill id Rs."+totalBill);
	}

}