package com.ideyatech.ut.exercise;

import java.util.ArrayList;

public class Promos {
	public int checkPromo1(ArrayList <Product> products,Product product)
	{
		int toReduce=0;
		for(int x=0;x<products.size();x++){
			if(products.get(x).getProductID().equals(product.getProductID()))
			{
				toReduce=products.get(x).getQuantity()/3;
			}
		}
		return toReduce;
	};
	
	public void checkPromo2(ArrayList <Product> products,Product product,Product small)
	{
		int smallAdded=0;
		for(int x=0;x<products.size();x++){
			if(products.get(x).getProductID().equals(product.getProductID()))
			{
				smallAdded=products.get(x).getQuantity()/5;
			}
		}	
		for(int x=0;x<products.size();x++){
			if(products.get(x).getProductID().equals(small.getProductID()))
			{
				small.setFree(smallAdded);
			}
		}			
		
	}	
	public void checkPromo3(ArrayList <Product> products,Product product,Product oneGBP)
	{
		int oneGBAdded=0;
		for(int x=0;x<products.size();x++){
			if(products.get(x).getProductID().equals(product.getProductID()))
			{
				oneGBAdded=products.get(x).getQuantity();
			}
		}	
		for(int x=0;x<products.size();x++){
			if(products.get(x).getProductID().equals(oneGBP.getProductID()))
			{
				oneGBP.setFree(oneGBAdded);
			}
		}			
		
	}
}
