package test;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private static final double ImportTax = 0.05;
	private static final double SALES_TAX = 0.1;
	private final String category;
	private final boolean imported;
	private final double costPrice;
	private List<String> exempted = new ArrayList<>();
	public Item(String category,boolean imported,double costPrice)
	{
		this.category = category;
		this.imported = imported;
		this.costPrice = costPrice;
		exempted.add("book");
		exempted.add("medical");
		exempted.add("food");
	}
	
	public float calculatedCost() {
		float cost = (float) (costPrice + ifItemInExemptedList(exempted, category)*SALES_TAX*costPrice
				+ ifItemImported()*ImportTax*costPrice);
		return cost;
	}
	
	private int ifItemInExemptedList(List<String> exempted,String category)
	{
		if(exempted.contains(category))
			return 0;
		return 1;
	}
	private int ifItemImported()
	{
		if(imported)
			return 1;
		return 0;
	}

}
