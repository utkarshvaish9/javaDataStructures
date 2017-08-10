package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ItemTest {
	
//	private static final ArrayList<Goods> goodsList = new ArrayList<>();

	@Test
	public void costForDomesticAndExemptedItem()
	{	
		assertEquals(12.49,new Item("book",false,12.49).calculatedCost(),0.01);
	}
	@Test
	public void costForDomesticAndUnExemptedItem()
	{	
		assertEquals(13.73,new Item("music",false,12.49).calculatedCost(),0.01);
	}
	@Test
	public void costForImportedAndExemptedItem()
	{	
		assertEquals(13.11,new Item("book",true,12.49).calculatedCost(),0.01);
	}
	@Test
	public void costForImportedAndUnExemptedItem()
	{	
		assertEquals(14.36,new Item("music",true,12.49).calculatedCost(),0.01);
	}
	
}
