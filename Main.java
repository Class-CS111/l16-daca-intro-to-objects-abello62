/********************************************
*	DEVELOPER:	ALEJANDRO BELLO
* COLLABORATORS: <names>
*	LAST MODIFIED:	04/11/2025
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    //TODO PART 3: test your setter/getter here!

    DACArecipient test1 = new DACArecipient(); 
    DACArecipient test2 = new DACArecipient(); 
   
    
    /*test.setSurname("Bello");
    test.setBirthday(2451564);
    test.setSex('M');*/
    test1.setSurname("Alejandro"); 
    test1.setGivenName("Bello");
    test1.setUscisNumber("12-3-456"); 
    test1.setCountryOfOrigin("Mexico");
    test1.setBirthday(123456);
    test1.setValidFromDate(02305);
    test1.setExpirationDate(2345678);
    test1.setSex('M');

    //test.surname = " " ; 
    /*System.out.println("Test surname = " + test.getSurname());
  
    System.out.println("Test birthday = " + test.getBirthday());
    System.out.println("Test sex = " + test.getSex());
    //test.surname);*/

    System.out.println("Person 1");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + test1.getSurname());
    System.out.println("Given Name: " + test1.getGivenName());
    System.out.println("USCIS Number: " + test1.getUscisNumber());
    System.out.println("Country of Origin: " + test1.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + test1.getBirthday());
    System.out.println("Valid From Date(JDN): " + test1.getValidFromDate()); 
    System.out.println("Expiration Date(JDN): " + test1.getExpirationDate());
    System.out.println("Sex: " + test1.getSex());

    test2.setAll("Mendez", "Javier", "56-3-445", " Venezuela", 2451564, 3956753, 3956840, 'M');

    System.out.println("Person 1");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + test2.getSurname());
    System.out.println("Given Name: " + test2.getGivenName());
    System.out.println("USCIS Number: " + test2.getUscisNumber());
    System.out.println("Country of Origin: " + test2.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + test2.getBirthday());
    System.out.println("Valid From Date(JDN): " + test2.getValidFromDate()); 
    System.out.println("Expiration Date(JDN): " + test2.getExpirationDate());
    System.out.println("Sex: " + test2.getSex());
  }
}
