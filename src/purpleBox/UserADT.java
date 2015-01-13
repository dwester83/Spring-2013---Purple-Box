package purpleBox;
/**
 * @author Daniel Wester, Jin Yu, Vayluong Chea, Lei Zhang
 */

import java.util.*;

public interface UserADT {
	
	/**
	 * Gives a array list of all the movies in the box
	 * 
	 * @return List return all movies
	 * @ensure ArrayList<MovieADT> will be returned
	 */
	public ArrayList<MovieADT> getMovieList();
	
	/**
	 * Puts a checked out movie back into the box
	 * 
	 * @param id int ID of the movie to return to the box
	 * @return MovieADT representation of the movie being returned
	 * @require id >= 1
	 */
	public MovieADT returnMovie(int id);
	
	
	/**
	 * Searches for movies by the title of the movie, then returns a array list of the movies it found.
	 * 
	 * @param keyword String of the title of the movies to search
	 * @return ArrayList<MovieADT> list of movies that match the input title
	 * @ensure A list of all the movies that match the input title.
	 */
	public ArrayList<MovieADT> search(String keyword);
	
	/**
	 * Searches for movies by the year they were released, then returns a array list of the movies it found.
	 * 
	 * @param year int of the year for movies released that year
	 * @return ArrayList<MovieADT> list of movies that match the input year
	 * @require year >= 0 && year <= 9999
	 * @ensure A list of all the movies that match the input year.
	 */	
	public ArrayList<MovieADT> search(int year);
	
	/**
	 * Checks out a movie from the box, returns a true statement if it was successful; false if it failed.
	 * 
	 * @param id int ID of the movie to check out of the box
	 * @return boolean If check out successfully, return true; or return false.
	 * @require id >= 1
	 * @ensure The movie was checked out (true) or not checked out (false)
	 */
	public boolean checkOut(int id);
	
	/**
	 * Gets the credit card information to charge the person checking the a movie out, returns a true statement if it was successful; false if it failed.
	 * 
	 * @param type String The type of the credit card. Visa, MasterCard, American Express are the only ones accepted. 
	 * @param number int The credit card account number.
	 * @param experationMonth int the month the credit card expires.
	 * @param experationYear int the year the credit card expires.
	 * @return boolean If the payment was successfully, return true; or return false.
	 * @require type == (Visa || MasterCard || American Express)
	 * @require number >= 1
	 * @require experationMonth >= 1 && experationMonth <= 12
	 * @require experationYear >= 2013
	 */
	public boolean doPayment(String type, int number, int experationMonth, int experationYear);
	
}
