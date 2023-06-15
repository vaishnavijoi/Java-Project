package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
	{
		System.out.println("WELCOME TO XYZ DEPARTMENTAL STORE");
		System.out.println("------------------------------------------------");

		
		Scanner scan = new Scanner(System.in);

		DepartmentalStore store = new DepartmentalStore();

		store.addProduct(); 	//1. Adding product into DataBase

		int choice = 1;

		while(choice==1)
		{
			store.displayProduct();		//2. Displaying Product
			store.buyProduct();			//3. Buying Products

			System.out.println("Enter 1 to Continue or any other No to checkout");
			choice = scan.nextInt();
			System.out.println("------------------------------------------------");
		}

		store.ckeckOut();
		scan.close();
	}

}
