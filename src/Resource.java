/**
* Resource class is a base class that both Book and a new Journal 
* class can extend from (inherit from).
* @author Unwana and Amelia
* @version 2.14.2019
*/

public class Resource {
  // create different fields
  private String title;
  private String pub;
  private boolean elec;
  private boolean checkedOut;
  private String borrower;
  private String type;

  /**
 * Create a Resource 
 *
 * @param title the title of the resource 
 * @param type the type of the resource 
 * @param pub the publisher of the resource 
 * @param elec if the resource is electronic
 */
  public Resource( String type, String title, String pub, boolean elec) {
    this.type = type;
    this.title = title;
    this.pub = pub;
    this.elec = elec;
  }
  
  /** create a method that gets the type of the item
   * @return a String that contains the type of the item
   */
  public String getType() {
    return this.type;
  }
  
  /** create a method that gets the title of the item
   * @return a String that contains the title of the item 
   */
  public String getTitle(){
      return this.title;
  }
  
  /** create a method that gets the name of the publisher of the item 
   * @return a String that contains all publisher name of the item 
   */
  public String getPublisher() {
      return this.pub;
  }

  /** create a method that returns the info on whether the item is electronic
   * @return a String about whether the item is electronic or not
   */
  public String elec() {
    if (elec) {
      return "Electronic";
    } else {
      return "Physical";
    }
  }
  
  /** create a method that check if the item has been checked out
   * @return a true boolean if the item has been checked out
   * and false boolean if otherwise
   */
  public boolean getCheckedOut() {  
      if (checkedOut) {
        return true;
      }
      return false;
  }
  
  /** create a method that checks out the item to a borrower
   * @param borrower the borrower of the item 
   */
  public void checkOut( String borrower) {
    this.borrower = borrower;
    checkedOut = true;
  }

  /** create a method that returns the name of the item borrower 
   * @return a String that contains name of the borrower 
   */
  public String getBorrower() {
    return borrower;
  }

  /** create a method that checks in the item
   */
  public void checkIn() {
    checkedOut = false;
    borrower = null;
  }

  /** create a method that returns the status of the item
   * @return a String "Checked out to..." if it's checked out, or
   * " Available" if otherwise
   */
  public String status() {
    if (checkedOut) {
      return "Checked out to " + borrower;
    }
    else {
      return "Available";
    }
  }
}
