package cse12pa1student;

import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BasketTest2 {

	public static Collection<Object[]> BAGNUMS =
			Arrays.asList(new Object[][] { {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}, {12} });
	private int bagType;

	public BasketTest2(int bagType) {
		super();
		this.bagType = bagType;
	}

	@Parameterized.Parameters(name = "Basket{index}")
	public static Collection<Object[]> bags() {
		return BAGNUMS;
	}
	
	private Basket makeBasket() {
		switch(this.bagType) {
			case 0: return new Basket0();
			case 1: return new Basket1();
			case 2: return new Basket2();
			case 3: return new Basket3();
			case 4: return new Basket4();
			case 5: return new Basket5();
			case 6: return new Basket6();
			case 7: return new Basket7();
			case 8: return new Basket8();
			case 9: return new Basket9();
			case 10: return new Basket10();
			case 11: return new Basket11();
			case 12: return new Basket12();
		}
		return null;
	}
	

	
	@Test
	public void test1() {
		Basket basketToTest = makeBasket();

		Item i = new Item("Shampoo", 5);
		basketToTest.addToBasket(i);
		assertEquals(1, basketToTest.count());
	}


	@Test
	public void test2() {
		Basket basketToTest = makeBasket();

		Item i = new Item("Shampoo", 5);
		Item j = new Item("Ziploc Bags", 3);
		Item k = j;
		Item l = new Item("Detergent", 7);
		basketToTest.addToBasket(i);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		basketToTest.addToBasket(l);

		assertEquals(2, basketToTest.countItem(j));
	}
	

	@Test
	public void test3(){
		Basket basketToTest = makeBasket();
		String item = "Soap";
		int cost = 2;
		Item example = new Item(item, cost);
		
		for(int i = 0; i < 1500; i++){
			basketToTest.addToBasket(example);
			cost ++;

		}

		assertEquals(1500, basketToTest.count());
	}
	

	@Test
	public void test4(){
		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item l = new Item("Detergent", 7);

		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(l);

		basketToTest.removeFromBasket(l);

		assertEquals(2, basketToTest.count());

	}


	@Test
	public void test5(){
		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item l = new Item("Detergent", 7);

		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(l);

		assertEquals(14, basketToTest.totalCost());

	}

	@Test 
	public void test6(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Ziploc Bags", 3);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);


		assertEquals(true, basketToTest.removeFromBasket(j));

	}

	@Test 
	public void test7(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);

		assertEquals(true, basketToTest.removeFromBasket(j));



	}


	
	@Test 
	public void test8(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Ziploc Bags", 3);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);

		assertEquals(true, basketToTest.removeAllFromBasket(j));


	}


	@Test 
	public void test9(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = j;
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		basketToTest.removeAllFromBasket(j);


		assertEquals(0, basketToTest.countItem(j));

	}

	
	@Test 
	public void test10(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Ziploc Bags", 3);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);


		assertEquals(3, basketToTest.count());

	}

	

	@Test 
	public void test11(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Ziploc Bags", 3);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		
		basketToTest.removeFromBasket(a);

		assertEquals(false, basketToTest.removeFromBasket(a));


	}


	@Test 
	public void test12(){

		Basket basketToTest = makeBasket();
		
		Item a = null;
		Item j = null;
		Item k = null;
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		

		assertEquals(3, basketToTest.count());
		

	}

	
	@Test 
	public void test13(){

		Basket basketToTest = makeBasket();
		Item a = null;
		Item j = null;
		Item k = null;
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);

		assertEquals(true, basketToTest.removeFromBasket(a));
		
		

	}
	

	@Test 
	public void test14(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Peanut Butter", 5);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		
		basketToTest.removeFromBasket(j);

		assertEquals(false, basketToTest.removeFromBasket(j));


	}

	
	@Test
	public void test15(){
		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Peanut Butter", 2);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);

		basketToTest.removeAllFromBasket(j);

		assertEquals(2, basketToTest.count());



	}


	@Test
	public void test16(){
		Basket basketToTest = makeBasket();
		Item a = new Item("Vaccum", 140);
		Item j = new Item("Ziploc Bags", 7);
		Item k = new Item("Peanut Butter", 2);
		Item l = new Item("Water", 1);
		Item m = j;
		Item n = new Item("Ziploc Bags", 7);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		basketToTest.addToBasket(l);
		basketToTest.addToBasket(m);
		basketToTest.addToBasket(n);
	
		assertEquals(3, basketToTest.countItem(m));



	}



	
	



}