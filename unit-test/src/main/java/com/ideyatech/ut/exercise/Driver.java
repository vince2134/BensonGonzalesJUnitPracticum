package com.ideyatech.ut.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String args[]){
		Product smallP;
		Product mediumP;
		Product largeP;
		Product oneGBP;
		Product addedProduct;
		smallP = new Product("UNLI_1GB","SMALL", 1000);
		mediumP = new Product("UNLI_2GB","MEDIUM", 1500);
		largeP = new Product("UNLI_5GB","LARGE", 3000);
		oneGBP = new Product("1GB_ADDTL","1GB", 500);
		ArrayList<Product> products = new ArrayList<Product>();

		products.add(smallP);
		products.add(mediumP);
		products.add(largeP);
		products.add(oneGBP);
		
		GlobeShoppingCart cart = new GlobeShoppingCart();
		
		
		
		String codeEntered="";
		
		
		Scanner scan = new Scanner(System.in);

		for(;!codeEntered.equals("CHECKOUT");)
		{		
			System.out.println("Code\t\tName\t\tPrice");
			for(int x=0;x<products.size();x++){
				System.out.println(products.get(x).getProductID()+"\t"+
						products.get(x).getName()+"\t\t"+
						products.get(x).getPrice());
			}
			
			System.out.println("Enter the code to be added (Type CHECKOUT to checkout):");
			codeEntered=scan.nextLine();
			for(int x=0;x<products.size();x++){
				if(products.get(x).getProductID().equals(codeEntered))
				{
					cart.addProduct(products.get(x));
					
				}
			}
		}

		cart.checkout();

		
		
	}
}
