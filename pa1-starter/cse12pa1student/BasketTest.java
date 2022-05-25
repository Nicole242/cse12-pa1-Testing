package cse12pa1student;

import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BasketTest {

	public static Collection<Object[]> BAGNUMS =
			Arrays.asList(new Object[][] { {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}, {12} });
	private int bagType;

	public BasketTest(int bagType) {
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
	/*
	@Test
	public void addedHasCount1() {
		Basket basketToTest = makeBasket();

		Item i = new Item("Shampoo", 5);
		basketToTest.addToBasket(i);
		assertEquals(1, basketToTest.count());
	}


	@Test
	public void countEachItem() {
		Basket basketToTest = makeBasket();

		Item i = new Item("Shampoo", 5);
		Item j = new Item("Ziploc Bags", 3);
		Item k = j;
		//Item k = new Item("Ziploc Bags", 3);
		Item l = new Item("Detergent", 7);
		basketToTest.addToBasket(i);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);
		basketToTest.addToBasket(l);

		assertEquals(2, basketToTest.countItem(j));
	}
	

	@Test
	public void addLotsofItems(){
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
	public void addthenRemove(){
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
	public void findTotalCost(){
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
	public void checkWhatsinBasket(){

		Basket basketToTest = makeBasket();
		Item a = new Item("Coffee", 4);
		Item j = new Item("Ziploc Bags", 3);
		Item k = new Item("Ziploc Bags", 3);
		basketToTest.addToBasket(a);
		basketToTest.addToBasket(j);
		basketToTest.addToBasket(k);

		basketToTest.removeFromBasket(j);

		assertEquals(false, basketToTest.removeAllFromBasket(k));



	}
	*/

	@Test
	public static void


}
