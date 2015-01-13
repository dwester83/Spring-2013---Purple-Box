package purpleBox;
/**
 * @author Daniel Wester, Jin Yu, Vayluong Chea, Lei Zhang
 */

public interface AdminADT extends UserADT {
	
	/**
	 * Creates and adds a movie into the box.
	 * 
	 * @param title String of a movie's title 
	 * @param year int of a movie's publish year
	 * @param type String of a movie's type, eg. action, horror..
	 * @param description String of a movie's description
	 * @param price float price of a movie to rent
	 * @param quantity int number of the movie to put in the box
	 * @require year <= 9999 && year >= 0
	 * @require price >= 0
	 * @require quantity >= 1
	 * @ensure movie will generate an appropriate ID and be added to the box
	 */
	public void addMovie(String title, int year, String type, String description, double price, int quantity);
	
	/**
	 * This will add a movie object into the box.
	 * 
	 * @param movie MovieADT to be added to the box
	 * @ensure movie will be added to the box
	 */
	public void addMovie(MovieADT movie);
	
	/**
	 * Entered id will remove movie with that id from the box
	 * 
	 * @param id int ID of the movie to be removed from the box
	 * @return MovieADT The movie that has been removed
	 * @require id >= 1
	 */
	public MovieADT removeMovie(int id);
	
	/**
	 * Will edit a movie's title in the box
	 * 
	 * @param id int ID of the movie to be edited
	 * @param title String of the new title for the movie
	 * @require id >= 1
	 */
	public void editMovieTitle(int id, String title);
	
	/**
	 * Will edit a movie's description in the box
	 * 
	 * @param id int ID of the movie to be edited
	 * @param description String of the new description of the movie
	 * @require id >= 1
	 */
	public void editMovieDescription(int id, String description);
	
	/**
	 * Will edit a movie's description in the box
	 * 
	 * @param id int ID of the movie to be edited
	 * @param year int of the new year for the movie
	 * @require id >= 1
	 */
	public void editMovieYear(int id, int year);
	
	/**
	 * Will edit a movie's year in the box
	 * 
	 * @param id int ID of the movie to be edited
	 * @param type String of the new type of the movie
	 * @require id >= 1
	 */
	public void editMovieType(int id, String type);
	
	/**
	 * Will edit a movie's price in the box
	 * 
	 * @param id int ID of the movie to be edited
	 * @param price double of the new price of the movie
	 * @require id >= 1
	 */
	public void editMoviePrice(int id, double price);
	
}
