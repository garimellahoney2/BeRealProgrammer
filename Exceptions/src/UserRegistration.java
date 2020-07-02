import java.util.*;
class InvalidCountryException extends Exception
{
	//String message;
	InvalidCountryException(String message)
	{
		//super(); even super will be called if not called
		//this.message = message;
		super(message);
	}
	/*public String getMessage(String message) - we shouldnot do because we need to pass message again
	{
		return message;
	}*/
	/*public toString will print message that we given if we print object directly*/
}
public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String userinput = sc.next();
    String[] array = userinput.split(",");
    String username = array[0];
    String country = array[1];
    UserRegistration us = new UserRegistration();
    try
    {
    	us.registerUser(username, country);
    }
		catch(Exception e)
    {
			System.out.println(e.getMessage());//to String will print direct when object printed directly
			System.out.println(e);//but how it is printing child name
    }
	}
void registerUser(String username,String userCountry) throws InvalidCountryException
{
if(userCountry.equals("India"))
{
System.out.println("User registration done successful");	
}
else
{
	throw new InvalidCountryException("User Outside India cannot be registered");
}
System.out.println("hi");
}
}
