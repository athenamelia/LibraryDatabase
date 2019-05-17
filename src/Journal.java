/**
* Journal class which extends the Resource class creates a Journal 
* @author Unwana and Amelia Tran
* @version 2.14.2019
*/

public class Journal extends Resource {
  // create different fields
  private String title;
  private String publisher;
  private boolean checkedOut;
  private String frequency;
  private int yearStart, yearEnd;
  private boolean electronic;

/**
 * Create a Journal 
 *
 * @param title the title of the journal 
 * @param pub the publisher of the journal 
 * @param start start year of the range
 * @param end end year of the range
 * @param fre the frequency the journal is checked out 
 */

  public Journal(String title, String pub, int start, int end, String fre) {
  	 super("Journal", title, pub, true);
     yearStart = start;
     yearEnd = end;
     frequency = fre;
  }
 /** create a method to get the year end of the year range the jounrnal is published
 * @return the yearEnd if it's not 0, return nothing if it's 0
 */
  public String yearEndJournal() {
    if (yearEnd == 0) {
        return "";
    }
    else{
      return "yearEnd";
    }
  }

  /** create a method that returns the information of the journal 
   * @return a String that contains all information of the journal 
   */
  public String toString() {
      return "Title: " + getTitle() + "\n"
   			+ "Type: Journal " + "\n"
   			+ "Publisher: " + getPublisher() +"\n"
   			+ "Year range: " + yearStart + "-" + yearEndJournal() + "\n"
   			+ "Frequency: " + frequency +"\n"
   			+ elec() + "\n"
   			+ status();
   }
  
}
