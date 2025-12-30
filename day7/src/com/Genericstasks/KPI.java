package com.Genericstasks;

public class KPI<T extends Number> 
{
	public T sales;
	public T revenue;
	public T profit;
	
	public KPI(T sales, T revenue, T profit) 
	{
		super();
		this.sales = sales;
		this.revenue = revenue;
		this.profit = profit;
	}

	@Override
	public String toString() 
	{
		return "KPI [sales=" + sales + ", revenue=" + revenue + ", profit=" + profit + "]";
	}

	public static void main(String[] args) 
	{
		KPI k= new KPI(50000,100000.00,500000f);
		System.out.println(k);
		
	}

}
