package coffee.production.controller;

public class Coffee 
{
	private String Coff_Name;
	private double Coff_Price;
	
	public String getCoff_Name() 
	{
		return Coff_Name;
	}
	public void setCoff_Name(String coff_Name) 
	{
		Coff_Name = coff_Name;
	}
	public double getCoff_Price() {
		return Coff_Price;
	}
	public void setCoff_Price(double coff_Price) 
	{
		Coff_Price = coff_Price;
	}
	public Coffee(String coff_Name, double coff_Price) 
	{
		super();
		Coff_Name = coff_Name;
		Coff_Price = coff_Price;
	}
	public Coffee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Coffee [Coff_Name=" + Coff_Name + ", Coff_Price=" + Coff_Price + "]";
	}
	
	
}
