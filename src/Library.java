
/**
* Library class that has main methods
* @author Unwana and Amelia Tran
* @version 2.14.2019
*/

public class Library {

  // create main method
	public static void main( String[] args) {
    // create a resource array named library 
    Resource[] library = new Resource[12];

    // declare specific cells in the array 
    library[0] = new Book("Ancillary Justice", "Anne Leckie", "Orbit", 409, 2013, "Science Fiction", false);
    library[1] = new Book("Data science for dummies", "Lillian Pierson", "John Wiley and Son, Inc.", 0, 2017, "Electronic Books", true);
    library[2] = new Book("Madame Recamier : The Biography of a Flirt", "Henry Dwight Sedgwick", "Borodino Books", 265, 2017, 
       "Electronic Books", true);
    library[3] = new Book("Ninefox Gambit", "Yoon Ha Lee", "Solaris", 317, 2016, "Science fiction", false);
    library[4] = new Book("The tale of Cho Ung : a classic of vengeance, loyalty, and romance", "Sookja Cho", "Columbia University Press", 
       200, 2018, "Romance Fiction", false);
    library[5] = new Journal("Annual review of criminology", "Annual Reviews", 2018, 0, "Annual");
    library[6] = new Journal("Inks : the journal of the Comics Studies Society", "The Ohio State University Press", 2017, 0, 
       "Three times a year");
    library[7] = new Journal("Tax benefits for adoption", "Dept. of the Treasury, Internal Revenue Service", 2002, 2004, "Annual");
    library[8] = new CD("Anthem", "Matt Haimovitz", "Oxingale Records : Artemis Classics", 2003, 69);
    library[9] = new CD("Never mind the bollocks, here’s the Sex Pistols", "Sex Pistols", "Warner Bros", 1977, 37);
    library[10] = new DVD("Horrible Bosses 2", "Warner Home Video", 2015, 108, 
      "Jason Bateman, Charlie Day, Jason Sudeikis, Jennifer Aniston, Jamie Foxx, Chris Pine, Kevin Spacey, Christoph Waltz", 
      "Comedy Films");
    library[11] = new DVD("Sweeney Todd: the demon barber of Fleet Street", 
      "Turner Home Entertainment", 2004, 139, 
      "Angela Lansbury, George Hearn, and the original Broadway cast", "Musicals");
    
    // perform checkOut method
    library[0].checkOut("Amy Tayloe");
    library[2].checkOut("Valerie Barr");
    library[6].checkOut("Valerie Barr");
    library[11].checkOut("Amy Tayloe");

    // perform checkIn method
    library[0].checkIn();
  
    // print out the array
    System.out.println();
    for(int i = 0; i < library.length; i++){
      System.out.println(library[i].toString());
      System.out.println();
    }

    Resource[] checkedOut = Library.getAllCheckedOut(library);
    
    // print out the title and types of the items that have been checked out
    System.out.println();
    System.out.println("All checked out:");
    for(int i = 0; i < checkedOut.length; i++){
      System.out.println(checkedOut[i].getTitle()+" ("+checkedOut[i].getType()+")");
    }

    Resource[] checkedOutAmy = Library.getAllUserHasCheckedOut(library, "Amy Tayloe");

    // print out the title and types of the items that have been checked out by a specific borrower
    System.out.println();
    System.out.println("All checked out to Amy Tayloe:");
    for(int i = 0; i < checkedOutAmy.length; i++){
      System.out.println(checkedOutAmy[i].getTitle()+" ("+checkedOutAmy[i].getType()+")");
    }

    Resource[] allDVD = Library.getAllOfType(library, "DVD");

    // print out the title and types of the items whose type is called
    System.out.println();
    System.out.println("All DVDs:");
    for(int i = 0; i < allDVD.length; i++){
      System.out.println(allDVD[i].getTitle()+" ("+allDVD[i].getType()+")");
    }
    
  }

  /** A method to get the information of the items that have been checked out
  * @param library a Resource array 
  * @return smaller array of Resources. 
  */
  public static Resource[] getAllCheckedOut( Resource[] library) {
      int count = 0;
      // update the count if the item in the library is checked out
      for(int i = 0; i < library.length; i++){
    	    if (library[i].getCheckedOut()) { 
              count = count++; 
          }
      }
      // create a Resource array whose length is equal to count 
      // that contains the items that have been checked out
      Resource[] libCheckOut = new Resource[count];
    	for(int i = 0; i < library.length; i++){
          if (library[i].getCheckedOut()) { 
    			    for ( int c = 0; c < libCheckOut.length; c++) {
                  libCheckOut[c] = library[i];
    			    }
          }
      }
          
      return libCheckOut;       
  }  

  /** A method to get the information of the items that have been checked out by a specific borrower
  * @param library a Resource array 
  * @param borrower the name of the borrower
  * @return smaller array of Resources. 
  */
  public static Resource[] getAllUserHasCheckedOut( Resource[] library, String borrower){
      int count = 0;
      // update the count if the item in the library is checked out
      for(int i = 0; i < library.length; i++){
          if (library[i].getCheckedOut()) { 
              count = count++; 
          }
      }
      
      // create a Resource array whose length is equal to count 
      // that contains the items that have been checked out by that borrower    
      Resource[] lib = new Resource[count];
      for(int i = 0; i < library.length; i++){
          if (library[i].getCheckedOut()) { 
              if (library[i].getBorrower() == borrower){
                  for ( int c = 0; c < lib.length; c++) {
                      lib[c] = library[i];
                  }
              }
          }
      }
      return lib;       

  }
  
  /** A method to get the information of the checked out items that are of specific type
  * @param library a Resource array 
  * @param type the type of the item
  * @return smaller array of Resources. 
  */
  public static Resource[] getAllOfType( Resource[] library, String type){
      int count = 0;
      // update the count if the item in the library is checked out
      for(int i = 0; i < library.length; i++){
          if (library[i].getCheckedOut()) { 
              count = count++; 
          }
      }
       
      // create a Resource array whose length is equal to count 
      // that contains the checked out items that are of specific type
      Resource[] typeCheckOut = new Resource[count];
      for(int i = 0; i < library.length; i++){
          if (library[i].getCheckedOut()) { 
              if (library[i].getType() == type){
                  for ( int c = 0; c < typeCheckOut.length; c++) {
                      typeCheckOut[c] = library[i];
                  }
              }
          }
      }

      return typeCheckOut;    
  }

}