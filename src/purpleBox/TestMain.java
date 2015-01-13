package purpleBox;
import java.util.ArrayList;


public class TestMain {
	public static void main(String[] args) {
		
		//Movie test
		MovieADT movie1 = new Movie();
		movie1.setTitle("Titanic");
		movie1.setYear(1997);
		movie1.setType("Drama");
		movie1.setDescription("A boat sinks.");
		movie1.setPrice(2.99);
		movie1.setQuantity(4);
		movie1.setID(9);
		
		System.out.println(
			"***Movie Test 1***" +
			"\nName: " + movie1.getTitle() + 
			"\nYear: " + movie1.getYear() + 
			"\nType: " + movie1.getType() + 
			"\nDescription: " + movie1.getDescription() + 
			"\nPrice: " + movie1.getPrice() + 
			"\nID: " + movie1.getID() +
			"\nQuantity: " + movie1.getQuantity());
		
		MovieADT movie2 = new Movie();
		movie2.setTitle("The Hobbit");
		movie2.setYear(2012);
		movie2.setType("Adventure");
		movie2.setDescription("People walking for a long time.");
		movie2.setPrice(4.99);
		movie2.setQuantity(4);
		movie2.setID(12);
		
		System.out.println(
			"***Movie Test 2***" +
			movie2.toString());
		
		//Admin Test
		AdminADT admin = new Admin();
		ArrayList<MovieADT> list = new ArrayList<MovieADT>();
		
		admin.addMovie("Aliens", 1986, "Action", "A bunch of people killing aliens.", 1.99, 4);
		admin.addMovie(movie1);
		admin.addMovie(movie2);
		
		//This should also see if the extends user was implemented correctly.
		list = admin.getMovieList();
		MovieADT movie3 = new Movie();
		//This should print every movie in the list.
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***Admin Test 1 - after adding all three movies***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		
		movie3 = admin.removeMovie(1);
		//At this time it will remove 2 movies because the ID is not being set for the two previously made.
		
		admin.editMovieTitle(9, "The Dark Knight");
		admin.editMovieDescription(9, "A man dressed in a bat suit.");
		admin.editMovieYear(9, 2008);
		admin.editMovieType(9, "True life story");
		admin.editMoviePrice(9, 20.59);
		
		//Checking to see if the movies were updated.
		list = admin.getMovieList();
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***Admin Test 2 - Should edit Titanic to The Dark Knight, and remove Alien***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		

		//User Test
		list = admin.getMovieList();
		//Hopefully shows the same list but you never know.
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***User Test 1 - Should show the same list as before***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		
		boolean success = admin.checkOut(9);
		//Again ID issue that needs to be fixed!!!!!!!!
		System.out.println("It worked with no problem? " + success);
		
		list = admin.getMovieList();
		//Hopefully shows the same list but you never know.
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***User Test 2 - should dock The Dark Knight by 1 quantity***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		
		movie3 = admin.returnMovie(9);
		System.out.println("It worked with no problem? " + success);
		
		list = admin.getMovieList();
		//Hopefully shows the same list but you never know.
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***User Test 3 - after return***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		
		success = admin.doPayment("Visa", 0001, 01, 2015);
		//not having this validate, or required could be a problem
		System.out.println("It worked with no problem? " + success);
		
		list = admin.search("The");
		//should just make a list of all these movies The dark knight, possibly the hobbit if the set ID is corrected.
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***User Test 4 - should be a list of all movies that start with The***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		
		list = admin.search(2012);
		//should just make a list of aliens.
		for (int i = 0; i < list.size(); i++){
			movie3 = list.get(i);
			System.out.println(
				"***User Test 5 - should be a list of all movies that have a year of 2012***" +
				"\nName: " + movie3.getTitle() + 
				"\nYear: " + movie3.getYear() + 
				"\nType: " + movie3.getType() + 
				"\nDescription: " + movie3.getDescription() + 
				"\nPrice: " + movie3.getPrice() + 
				"\nID: " + movie3.getID() +
				"\nQuantity: " + movie3.getQuantity());
		}
		
		
		
		
	}
}
