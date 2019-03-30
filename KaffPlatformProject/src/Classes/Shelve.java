//This is not wanted anymore....OR should we keep it as the connector to the DB? 


package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.RowSet;

public class Shelve {
	
	Connection connection; 
	Statement statement; 
	ResultSet resultSet; 
	RowSet rowSet;
	PreparedStatement ps; 
	
	Query[] quires = 
		{	new Query("remove book", "drop ..."), 
			new Query("owns by", "Select ...."), 
			new Query("borowed books", "Select ..."),
			new Query("add book", "Inset into..."), 
			new Query("sold books", "Select ..."),
			new Query("book title", "Select where bookTitle = ?"),
			new Query("books by level", "Select where level = ?"),
			new Query("all books", "Select * from kaff.books")
		};
	
	public Shelve() throws SQLException{
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kaff", "root", "root123");
		statement = connection.createStatement();
		
	}
	/*if book not in the lists, (we do not want repeated books)
	 *check the status and add to the ArrayList according to book type
	 *return true if added. 
	 */
	public void addBook(Book b){
		//get book information and get add book query then send the info to the DB		
	}
	
	//remove the book from the list and return it.. 
	public void removeBook(Book b){
		//send the query to DB to remove the book
	}
	
	/* 
	 * return true if the book in either book lists, false other wise.
	 * */
	public boolean isBookInShelve(Book b){
		return true;
	}
	
	//Look for books owned by this person and return array list of the books
	public ArrayList<Book> getBooksOwnedBy(Person p){
	
		return null;
	}
	
	//getters..
	public ArrayList<Book> getBooksForBorrow(){
		return null;
	}
	public ArrayList<Book> getBooksForSale(){
		return null;
	}
	
	/*
	 * Search in both lists looking for a book with the same BookID.
	 * return the book object or null if not there.
	 */
	public Book getBook(String bookID){

		
		return null;
	}
	
	//returns an array list of all books in the level
	public ArrayList<Book> getBooksByLevel(int level){
		return null;
	}
	//returns an array list of all books of the passed name
	public ArrayList<Book> getBooksByName(String name){
		return null;
	}
	
	//display all books
	public void displayAllBooks(){
		//call the query
	}
	
}
