/**
* DVD class which extends the Resource class creates the DVD 
* @author Unwana and Amelia Tran
* @version 2.14.2019
*/

public class DVD extends Resource {
  // create different fields
  private String title;
  private String performersDVD;
  private String publisher;
  private String genresDVD;
  private int yearPublished;
  private int lengthDVD;

 /** Create a DVD 
 *
 * @param title the title of the DVD 
 * @param performers the performers of the DVD 
 * @param publisher the publisher of the DVD 
 * @param year the publication year of the DVD 
 * @param length the length of the DVD 
 * @param genre if the genre of the DVD
 */

  public DVD( String title, String publisher, int year, int length, String performers, String genre) {
  	 super("DVD", title, publisher, false);
     performersDVD = performers;
     yearPublished = year;
     lengthDVD = length;
     genresDVD = genre;
  }

  /** create a method that returns the information of the DVD 
   * @return a String that contains all information of the DVD 
   */

   public String toString() {
      return "Title: " + getTitle() + "\n"
   			+ "Type: DVD " + "\n"
        + "Performers: " + performersDVD + "\n"
   			+ "Publisher: " + getPublisher() + "\n"
   			+ "Year: " + yearPublished + "\n"
   			+ "Length: " + lengthDVD + "\n"
        + "Genre: " + genresDVD + "\n"
   			+ elec() + "\n"
   			+ status();
   }
  
}
