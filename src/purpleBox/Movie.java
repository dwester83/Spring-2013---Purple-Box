package purpleBox;

public class Movie implements MovieADT 
{	
	private String title;
	private int year;
	private String type;
	private String description;
	private double price;
	private int id;
	private int quantity;
	
	/**
	 * Default constructor, just sets everything to empty.
	 */
	public Movie()
	{
		title = "";
		year = 0;
		type = "";
		description = "";
		price = 0;
		id = 0;
		quantity = 0;
	}
	
	/**
	 * Contructor that sets parameters
	 * 
	 * @param title1 String representation of the Title
	 * @param year1 int representation of the Year
	 * @param type1 String representation of the Type
	 * @param description1 String representation of the Description
	 * @param price1 double representation of the price
	 * @param id1 int representation of the ID
	 * @param quantity1 int representation of the Quantity
	 */
	public Movie(String title1, int year1, String type1, String description1, 
			double price1, int id1, int quantity1)			     
	{
		title = title1;
		year = year1;
		type = type1;
		description = description1;
		price = price1;
		id = id1;
		quantity = quantity1;
		
	}
	public void setTitle(String title1) 
	{
		title= title1;		
	}

	public void setYear(int year1) 
	{
		year = year1;	
	}

	public void setType(String type1)
	{
		type = type1;
		
	}

	public void setDescription(String description1) 
	{
		description= description1;
	}

	public void setPrice(double price1) 
	{
		price = price1;
	}
	
	public void setID(int id1)
	{
		id = id1;
	}
	
	public void setQuantity(int quantity1)
	{
		quantity = quantity1;
	}

	public String getTitle() 
	{
		return title;
	}

	public int getYear() 
	{
		return year;
	}

	public String getType() 
	{
		return type;
	}

	public String getDescription() 
	{
		return description;
	}

	public double getPrice() 
	{
		return price;
	}

	public int getID() 
	{
		return id;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public String toString()
	{
		String movieList = this.getTitle() + "\t" + this.getYear()
	            + "\t" + this.getType() +"\t"+this.getDescription()+ "\t"
	            + this.getPrice()+"\t"+ this.getID()+"\t"+ this.getQuantity();	       
	       
		return movieList;
		
	}

}
