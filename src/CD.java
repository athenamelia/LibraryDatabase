/**
* CD class which extends the Resouce class creates the CD 
* @author Unwana and Amelia Tran
* @version 2.14.2019
*/

public class CD extends Resource {
  // create different fields
  private String title;
  private String artistCD;
  private String publisher;
  private int yearPublished;
  private int lengthCD;

  /** Create a CD 
 *
 * @param title the title of the CD 
 * @param artist the artist of the CD 
 * @param publisher the publisher of the CD 
 * @param year the publication year of the CD 
 * @param length the length of the CD 
 */

  public CD(String title, String artist, String publisher, int year, int length) {
  	 super("CD", title, publisher, false);
     yearPublished = year;
     lengthCD = length;
     artistCD = artist;
  }

   /** create a method that returns the information of the CD 
   * @return a String that contains all information of the CD 
   */

   public String toString() {
      return "Title: " + getTitle() + "\n"
   			+ "Type: CD " + "\n"
        + "Artist: " + artistCD + "\n"
   			+ "Publisher: " + getPublisher() +"\n"
   			+ "Year: " + yearPublished + "\n"
   			+ "Length: " + lengthCD +"\n"
   			+ elec() + "\n"
   			+ status();
   }
  
}
