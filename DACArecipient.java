/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
CS111 3033
-----------------------------------------
<data, i.e. variables> 
- urname : String 
- giveName : String 
- uscisNumber : String 
- countryOfOrigin : String 
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
<actions, i.e. methods> 			// methods have parentheses 
+ getSurname() : String 		/	/Data's are private, methods are public
+ getGivenName() : String
+ getUscisNumber() : String 
+ getCountryOfOrigin() : String 
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int 
+ getSex() : char


+ setSurname(surname : String) : void 		
+ setGivenName(giveName : String) : void
+ setUscisNumber(uscisNumber : String) : void 
+ setCountryOfOrigin(countryOfOrigin : String ) : void 
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void 
+ setSex(sex : char) : void

+ settAll(surname : String, giveName : String, uscisNumber : String, 
countryOfOrigin : String, birthday : int, validFromDate : 
int, expirationDate : int, sex : char ) : void 

-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	private String surname; 
	private String givenName; 
	private String uscisNumber; 
	private String countryOfOrigin; 
	private int birthday, validFromDate, expirationDate; 
	private char sex; 

	

	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	/**
	 * retuens surname of calling object
	 * @return String representing surname 
	 */
	//+getSurName() : String  
	public String getSurname() 
	{
		return this.surname;
	}
	public String getGivenName()
	{
		return this.givenName;
	}
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	public String getCountryOfOrigin()
	{
		return this.countryOfOrigin;		
	}
	public int getBirthday()
	{
		return this.birthday;
	}
	public int getValidFromDate()
	{
		return this.validFromDate;
	}
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	public char getSex()
	{
		return this.sex;
	}




	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	
	//+ setSurname(surname : String) : void
	/**
	 * sets surname to parameter value of calling object
	 * @param surname String representing last name, asssume it exists and is valid
	 */
	public void setSurname(String surname) 
	{
		this.surname = surname; 
	}
	public void setGivenName(String givenName)
	{
		this.givenName = givenName; 
	}
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	public void setExpirationDate (int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	public void setSex (char sex)
	{
		this.sex = sex; 
	}

	//TODO: Write the setAll method. Remember to include documentation.
	/*  + setSurname(surname : String) : void 		
+ setGivenName(giveName : String) : void
+ setUscisNumber(uscisNumber : String) : void 
+ setCountryOfOrigin(countryOfOrigin : String ) : void 
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void 
+ setSex(sex : char) : void*/

/**
 * sett all data for object
 * @param surname String representing last name, asssume it exists and is valid
 * @param GivenName String representing first name, asssume it exists and is valid
 * @param uscisNumber String representing 3 part USCIS NUMBER, WITH DASHES
 * @param countryOfOrigin country naem, assume valid country 
 * @param birthday Julian day number for birthday
 * @param validFromDate Julian Day number for valid from date 
 * @param expirationDate Julain day number for expiration date
 * @param sex char represemting sex 
 */
public void setAll(String surname, String givenName, 
String uscisNumber, String countryOfOrigin, int birthday, 
int validFromDate, int expirationDate, char sex) {
	
	this.setSurname(surname); //this.surname = surname; 
	this.setGivenName(givenName);
	this.setUscisNumber(uscisNumber);
	this.setCountryOfOrigin(countryOfOrigin);
	this.setBirthday(birthday);
	this.setValidFromDate(validFromDate);
	this.setExpirationDate(expirationDate);
	this.setSex(sex);
}

}