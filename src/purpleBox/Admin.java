package purpleBox;
import java.util.ArrayList;


public class Admin extends User implements AdminADT {
	
	private int creationId;
	
	/**
	 * Default constructor, sets the creation ID to the default start.
	 */
	public Admin(){
		creationId = 0;
	}

	public void addMovie(String title, int year, String type,
			String description, double price, int quantity) {
		ArrayList<MovieADT> list = super.getMovieList();
		creationId++;
		MovieADT movie = new Movie(title, year, type, description, price, this.creationId, quantity);
		list.add(movie);
	}

	public void addMovie(MovieADT movie) {
		ArrayList<MovieADT> list = super.getMovieList();
		list.add(movie);
	}

	public MovieADT removeMovie(int id) {
		ArrayList<MovieADT> list = super.getMovieList();
		if (list.size() == 0)
			throw new ArrayIndexOutOfBoundsException("There's nothing in the list.");
		MovieADT movie;
		for (int i = 0; i < list.size(); i++){
			movie = list.get(i);
			if (movie.getID() == id) {
				list.remove(i);
				return movie;
			}
		}
		throw new ArrayIndexOutOfBoundsException("Movie isn't in the list");
	}

	/**
	 * Private method to get a movie by the id.
	 * 
	 * @param id int The ID of the movie to find
	 * @return MovieADT movie that it found in the list.
	 */
	private MovieADT getMovieById(int id){
		ArrayList<MovieADT> list = super.getMovieList();
		if (list.size() == 0)
			throw new ArrayIndexOutOfBoundsException("There's nothing in the list.");
		MovieADT movie;
		for (int i = 0; i < list.size(); i++){
			movie = list.get(i);
			if (movie.getID() == id) {
				return movie;
			}
		}
		throw new ArrayIndexOutOfBoundsException("Movie isn't in the list");
	}
	
	public void editMovieTitle(int id, String title) {
		MovieADT movie = getMovieById(id);
		movie.setTitle(title);
	}

	public void editMovieDescription(int id, String description) {
		MovieADT movie = getMovieById(id);
		movie.setDescription(description);
	}

	public void editMovieYear(int id, int year) {
		MovieADT movie = getMovieById(id);
		movie.setYear(year);
	}

	public void editMovieType(int id, String type) {
		MovieADT movie = getMovieById(id);
		movie.setType(type);
	}

	public void editMoviePrice(int id, double price) {
		MovieADT movie = getMovieById(id);
		movie.setPrice(price);
	}

}
