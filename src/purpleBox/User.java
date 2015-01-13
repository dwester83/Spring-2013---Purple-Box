package purpleBox;
import java.util.ArrayList;

public class User implements UserADT {

	private ArrayList<MovieADT> moviesToCheckOutList;
	
	/**
	 * Default constructor, creates the lists that this machine has.
	 */
	public User(){
		moviesToCheckOutList = new ArrayList<MovieADT>();
	}
	
	public ArrayList<MovieADT> getMovieList() {
		return this.moviesToCheckOutList;
	}

	public MovieADT returnMovie(int id) {
		
		MovieADT movie = new Movie();
		
		for (int i = 0; i < moviesToCheckOutList.size(); i++){
			movie = moviesToCheckOutList.get(i);
			if (movie.getID() == id) {
				int quant = movie.getQuantity();
				quant++;
				movie.setQuantity(quant);
				return movie;
			}
		}
		
		throw new NumberFormatException("The movie is not found in this list.");
	}

	public ArrayList<MovieADT> search(String keyword) {
		MovieADT movie = new Movie();
		ArrayList<MovieADT> searchList = new ArrayList<MovieADT>();
		
		for (int i = 0; i < moviesToCheckOutList.size(); i++){
			movie = moviesToCheckOutList.get(i);
			if ((movie.getTitle().toLowerCase()).contains(keyword.toLowerCase())) {
				searchList.add(movie);
			}
		}
		return searchList;
	}

	public ArrayList<MovieADT> search(int year) {
		MovieADT movie = new Movie();
		ArrayList<MovieADT> searchList = new ArrayList<MovieADT>();
		
		for (int i = 0; i < moviesToCheckOutList.size(); i++){
			movie = moviesToCheckOutList.get(i);
			if (movie.getYear() == year) {
				searchList.add(movie);
			}
		}
		return searchList;
	}

	public boolean checkOut(int id) {
		
		MovieADT movie = new Movie();
		
		for (int i = 0; i < moviesToCheckOutList.size(); i++){
			movie = moviesToCheckOutList.get(i);
			if (movie.getID() == id) {
				int quant = movie.getQuantity();
				if (quant == 0)
					return false;
				quant--;
				movie.setQuantity(quant);
				return true;
			}
		}
		
		return false;
	}

	public boolean doPayment(String type, int number, int experationMonth,
			int experationYear) {
		if (type == "Visa" || type == "MasterCard" || type =="American Express")
			if (number > 0)
				if (experationMonth >= 1 || experationMonth <= 12)
					if (experationYear >= 2013)
						return true;
		
		return false;
	}

}
