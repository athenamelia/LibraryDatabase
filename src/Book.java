/**
* Book class which extends the Resource class creates the Book 
* @author Unwana and Amelia Tran
* @version 2.14.2019
*/

public class Book extends Resource {
  // create 9 different fields
  private String title;
  private String author;
  private String pub;
  private int pageCount;
  private int yearPublished;
  private String genres;
  private boolean elec;
  private boolean checkedOut;
  private String customer;


/**
 * Create a Book 
 *
 * @param title the title of the book 
 * @param auth the author of the book 
 * @param pub the publisher of the book 
 * @param pagec the pages of the book 
 * @param year the publication year of the book 
 * @param gen the genre of the book 
 * @param elec if the book is electronic
 */

  public Book(String title, String auth, String pub, int pagec, int year,
  	String gen, boolean elec) {
  	 super("Book", title, pub, elec);
     author = auth;
     pageCount = pagec;
     yearPublished = year;
     genres = gen;
  }
   
   /** create a method that returns the information of the book 
   * @return a String that contains all information of the book 
   */
  public String toString() {
   	return "Title:" + getTitle() + "\n"
   			+ "Type: Book" + "\n"
   			+ "Author: " + author + "\n"
   			+ "Publisher: " + getPublisher() +"\n"
   			+ "Page Count: " + pageCount +"\n"
   			+ "Year Published: " + yearPublished +"\n"
   			+ "Genres: " + genres +"\n"
   			+ elec() + "\n"
   			+ status();


   }
  
}
