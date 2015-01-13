package purpleBox;

/**
 * @author Daniel Wester, Jin Yu, Vayluong Chea, Lei Zhang
 */

public interface MovieADT {
	
	/**
	 * Sets the title of the movie.
	 * 
	 * @param title String representation of the new title to be set.
	 * @ensure getTitle() == title
	 **/
	public void setTitle(String title);
	
	/**
	 * Sets the year the movie was released.
	 * 
	 * @param year int representation of the year the movie was released.
	 * @require year <= 9999 && year >= 0
	 * @ensure getYear() == year
	 **/
	public void setYear(int year);
	
	/**
	 * Sets the type/genre of the movie.
	 * 
	 * @param type String representation of the movie type/genre.
	 * @ensure getType() == type
	 **/
	public void setType(String type);
	
	/**
	 * Sets the description of the movie.
	 * 
	 * @param description String representation of the movie description.
	 * @ensure getDescription() == description
	 **/
	public void setDescription(String description);
	
	/**
	 * Sets the price of the movie
	 * 
	 * @param price double represents the price of the movie.
	 * @require price >= 0
	 * @ensure getPrice() == price
	 **/
	public void setPrice(double price);
	
	/**
	 * Returns the title of the movie.
	 * 
	 * @return String representation of the movie title.
	 **/
	public String getTitle();
	
	/**
	 * Returns the year the movie was released.
	 * 
	 * @return int representation of the year the movie was released.
	 * @ensure year <= 9999 && year >= 0
	 **/
	public int getYear();
	
	/**
	 * Returns the type/genre of the movie.
	 * 
	 * @return String representation of the type/genre of the movie.
	 **/
	public String getType();
	
	/**
	 * Returns the description of the movie.
	 * 
	 * @return String representation of the description of the movie.
	 **/
	public String getDescription();
	
	/**
	 * Returns a price of the movie.
	 * 
	 * @return double representation of the movie's price.
	 * @ensure getPrice() >= 0
	 **/
	public double getPrice();
	
	/**
	 * Returns the ID of the movie.
	 * 
	 * @return int representation of the ID
	 * @ensure getID() >= 1
	 */
	public int getID();
	
	/**
	 * Returns a string of all the movie information.
	 * 
	 * @return String representation of all the movie information.
	 **/
	public String toString();
        
	/**
     * Set an ID to to movie
     * 
     * @param id movie ID   
     * @require id >= 1
     */
    public void setID(int id);
        
    /**
     * Sets a quantity of the movie.
     * 
     * @param quantity int of the quanity of the movie.
     * @require quantity >= 1
     */
    public void setQuantity(int quantity);
    
    /**
     * Returns a quantity of the movie.
     * 
     * @return int Quantity of the movie.
     */
    public int getQuantity();
	
}
