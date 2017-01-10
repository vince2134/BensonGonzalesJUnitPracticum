package com.ideyatech.ut.exercise;

import java.util.ArrayList;

public class GlobeShoppingCart implements ShoppingCart {
	ArrayList <Product> products;
	double totalPrice=0;
	Product smallP;
	Product mediumP;
	Product largeP;
	Product oneGBP;
	Promos promo;
	
	public GlobeShoppingCart(){
		promo=  new Promos();
		products = new ArrayList <Product>();
		smallP = new Product("UNLI_1GB","SMALL", 1000);
		products.add(smallP);
		mediumP = new Product("UNLI_2GB","MEDIUM", 1500);
		products.add(mediumP);
		largeP = new Product("UNLI_5GB","LARGE", 3000);
		products.add(largeP);
		oneGBP = new Product("1GB_ADDTL","1GB", 500);
		products.add(oneGBP);
		
	}
	
	public void addProduct(Product product)
	{
		int found=0;
		for(int x=0;x<products.size()&&found==0;x++){
			if(products.get(x).getProductID().equals(product.getProductID()))
			{
				products.get(x).incrementQuantity();
				totalPrice+=products.get(x).getPrice();
				found =1;
			}
		}
		if(found==0)
		{
			System.out.println("Product Not Found");
		}
	}
	public double getTotalPrice(){
		return this.totalPrice;
	}
	public Product getSmallP() {
		return smallP;
	}

	public Product getMediumP() {
		return mediumP;
	}

	public Product getLargeP() {
		return largeP;
	}

	public Product getOneGBP() {
		return oneGBP;
	}

	public void checkout(){
		
		totalPrice=totalPrice-promo.checkPromo1(products, smallP)*smallP.getPrice();
		promo.checkPromo2(products,largeP,smallP);
		promo.checkPromo3(products,mediumP,oneGBP);	
		
		System.out.println("Cart");
		
		for(int x=0;x<products.size();x++){
			if(products.get(x).getQuantity()>0)
			{
				System.out.println(products.get(x).getQuantity()+"-"+products.get(x).getName());
			}
		}

		System.out.println("\nTotal Price:"+totalPrice);
		System.out.println("\nProduct:");
		for(int x=0;x<products.size();x++){
			if(products.get(x).getQuantity()+products.get(x).getFree()>0)
			{
				System.out.println(products.get(x).getQuantity()+products.get(x).getFree()+"-"+products.get(x).getName());
			}
		}		
	}
}
