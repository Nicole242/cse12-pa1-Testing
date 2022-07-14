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
	

	
	@Test
	public void addedHasCount1() {
		Basket basketToTest = makeBasket();

		Item i = new Item("Shampoo", 5);
		basketToTest.addToBasket(i);
		assertEquals(1, basketToTest.count());
	}



	
	
	@Test
	public void testAddingMany(){
		Basket basketToTest = makeBasket();
		String example_item = "Pot";
		int cost_of_item = 8;
		Item example = new Item(example_item, cost_of_item);
		
		for(int i = 0; i < 2000; i++){
			basketToTest.addToBasket(example);
			cost_of_item++;

		}

		assertEquals(2000, basketToTest.count());
	}

	@Test
	public void testCount() {
		Basket basketToTest = makeBasket();

		Item first = new Item("Strawberries", 6);
		Item second = new Item("Bread", 8);
		Item third = second;
		Item fourth = third;
		basketToTest.addToBasket(first);
		basketToTest.addToBasket(second);
		basketToTest.addToBasket(third);
		basketToTest.addToBasket(fourth);

		assertEquals(3, basketToTest.countItem(second));
	}
	



	@Test
	public void testingTotalCost(){
		Basket basketToTest = makeBasket();
		Item first_item = new Item("Water", 3);
		Item second_item = new Item("Apples", 2);
		Item third_item = new Item("Gatorade", 4);

		basketToTest.addToBasket(first_item);
		basketToTest.addToBasket(second_item);
		basketToTest.addToBasket(third_item);

		assertEquals(9, basketToTest.totalCost());

	}
	

	

	@Test 
	public void testingRemove(){

		Basket basketToTest = makeBasket();
		Item first = new Item("Paper Towels", 8);
		Item second = new Item("Tissue", 5);
		Item third = new Item("Soda", 2);
		Item fourth = new Item("Batteries", 15);
		basketToTest.addToBasket(first);
		basketToTest.addToBasket(second);
		basketToTest.addToBasket(third);
		basketToTest.addToBasket(fourth);


		assertEquals(true, basketToTest.removeFromBasket(second));

	}

	@Test
	public void testAddingandRemoving(){
		Basket basketToTest = makeBasket();
		Item first_item = new Item("Papayas", 5);
		Item second_item = new Item("Quinoa", 7);
		Item third_item = new Item("Coffee Creamer", 4);

		basketToTest.addToBasket(first_item);
		basketToTest.addToBasket(second_item);
		basketToTest.addToBasket(third_item);

		basketToTest.removeFromBasket(third_item);

		assertEquals(2, basketToTest.count());

	}
	
	@Test 
	public void testingEmpty(){


	Basket basketToTest = makeBasket();
		String example_item = "Brussel Sprouts";
		int cost_of_item = 5;
		Item example = new Item(example_item, cost_of_item);
		
		for(int i = 0; i < 1750; i++){
			basketToTest.addToBasket(example);
			cost_of_item++;

		}
		basketToTest.empty();


		assertEquals(0, basketToTest.count());
	}
	
	


	@Test 
	public void testingRemoveAll(){

		Basket basketToTest = makeBasket();
		Item one = new Item("Bowls", 10);
		Item two = new Item("Spoons", 7);
		Item three = new Item("Forks", 6);
		basketToTest.addToBasket(one);
		basketToTest.addToBasket(two);
		basketToTest.addToBasket(three);

		assertEquals(true, basketToTest.removeAllFromBasket(two));


	}

	

	@Test 
	public void testingRemovingEveryCopy(){

		Basket basketToTest = makeBasket();
		Item first_item = new Item("Oranges", 3);
		Item second_item = new Item("Baking Soda", 5);
		Item third_item = second_item;
		basketToTest.addToBasket(first_item);
		basketToTest.addToBasket(second_item);
		basketToTest.addToBasket(third_item);
		basketToTest.removeAllFromBasket(second_item);


		assertEquals(0, basketToTest.countItem(second_item));

	}

	@Test 
	public void testingRemoveAgain(){

		Basket basketToTest = makeBasket();
		Item one = new Item("Bananas", 2);
		Item two = new Item("Chips", 4);
		Item three = new Item("Turkey", 3);
		
		basketToTest.addToBasket(one);
		basketToTest.addToBasket(two);
		basketToTest.addToBasket(three);
		basketToTest.removeFromBasket(three);


		assertEquals(false, basketToTest.removeFromBasket(three));


	}


	
	@Test 
	public void testingDuplicates(){

		Basket basketToTest = makeBasket();
		Item i1 = new Item("Chocolate", 2);
		Item i2 = new Item("Rice", 6);
		Item i3 = new Item("Rice", 6);
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);
		basketToTest.addToBasket(i3);


		assertEquals(2, basketToTest.countItem(i2));

	}

	



	@Test 
	public void removeItemBeginning(){

		Basket basketToTest = makeBasket();
		Item i1 = new Item("Eggs", 8);
		Item i2 = new Item("Watermelon", 5);
		Item i3 = new Item("Paper Bags", 4);
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);
		basketToTest.addToBasket(i3);
		
		basketToTest.removeFromBasket(i1);

		assertEquals(false, basketToTest.removeFromBasket(i1));


	}


	
	@Test 
	public void testingAddNull(){

		Basket basketToTest = makeBasket();
		
		Item i1 = null;
		Item i2 = null;
	
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);

		
		assertEquals(2, basketToTest.count());
		

	}

	
	@Test 
	public void testingRemovingNull(){

		Basket basketToTest = makeBasket();
		Item i1 = null;
		Item i2 = null;
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);


		assertEquals(true, basketToTest.removeFromBasket(i1));
		
		

	}
	

	
	@Test
	public void removeAllOfOne(){
		Basket basketToTest = makeBasket();
		Item i1 = new Item("Cookies", 5);
		Item i2 = new Item("Windex", 7);
		Item i3 = i2;
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);
		basketToTest.addToBasket(i3);

		basketToTest.removeAllFromBasket(i2);

		assertEquals(0, basketToTest.countItem(i2));



	}

	
	@Test
	public void testingAddingOneCopy(){
		Basket basketToTest = makeBasket();
		Item i1 = new Item("Butter", 3);
		Item i2 = new Item("Yogurt", 5);
		Item i3 = new Item("Yogurt", 5);
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);



		assertEquals(true, basketToTest.removeFromBasket(i3));



	}
	

	@Test
	public void testingRemoveAllAgain(){
		Basket basketToTest = makeBasket();
		Item i1 = new Item("Butter", 3);
		Item i2 = new Item("Yogurt", 5);
		Item i3 = new Item("Yogurt", 5);
		
		basketToTest.addToBasket(i1);
		basketToTest.addToBasket(i2);
		basketToTest.addToBasket(i3);

		basketToTest.removeAllFromBasket(i2);





		assertEquals(1, basketToTest.count());



	}



}