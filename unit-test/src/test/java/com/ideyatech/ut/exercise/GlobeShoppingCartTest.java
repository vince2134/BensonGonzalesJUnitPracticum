package com.ideyatech.ut.exercise;
import org.junit.*;
import static org.junit.Assert.*;
public class GlobeShoppingCartTest {
	GlobeShoppingCart gsc;
	Product smallP;
	Product mediumP;
	Product largeP;
	Product oneGBP;
	@Before
	public void init(){
		gsc= new GlobeShoppingCart();
		smallP = new Product("UNLI_1GB","SMALL", 1000);
		mediumP = new Product("UNLI_2GB","MEDIUM", 1500);
		largeP = new Product("UNLI_5GB","LARGE", 3000);
		oneGBP = new Product("1GB_ADDTL","1GB", 500);
	}

	@Test
	public void testCase1(){
		gsc.addProduct(smallP);
		gsc.addProduct(smallP);
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.checkout();
		assertEquals("TotalPrice should be",14000,gsc.getTotalPrice(),0.05);
		assertEquals("SMALL",2,gsc.getSmallP().getFree()+gsc.getSmallP().getQuantity());
		assertEquals("LARGE",4,gsc.getLargeP().getFree()+gsc.getLargeP().getQuantity());
	}	

	@Test
	public void testCase2(){
		gsc.addProduct(smallP);
		gsc.addProduct(smallP);
		gsc.addProduct(smallP);
		gsc.addProduct(mediumP);
		gsc.checkout();
		assertEquals("TotalPrice should be",3500,gsc.getTotalPrice(),0.05);
		assertEquals("SMALL",3,gsc.getSmallP().getFree()+gsc.getSmallP().getQuantity());
		assertEquals("MEDIUM",1,gsc.getMediumP().getFree()+gsc.getMediumP().getQuantity());
		assertEquals("1GB",1,gsc.getOneGBP().getFree()+gsc.getOneGBP().getQuantity());
	}
	@Test
	public void testCase3(){
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.addProduct(largeP);
		gsc.addProduct(smallP);
		gsc.addProduct(smallP);
		gsc.addProduct(smallP);
		gsc.addProduct(mediumP);
		gsc.addProduct(mediumP);
		gsc.checkout();
		assertEquals("TotalPrice should be",20000,gsc.getTotalPrice(),0.05);
		assertEquals("LARGE",5,gsc.getLargeP().getFree()+gsc.getLargeP().getQuantity());
		assertEquals("SMALL",4,gsc.getSmallP().getFree()+gsc.getSmallP().getQuantity());
		assertEquals("MEDIUM",2,gsc.getMediumP().getFree()+gsc.getMediumP().getQuantity());
		assertEquals("1GB",2,gsc.getOneGBP().getFree()+gsc.getOneGBP().getQuantity());
	}
}
