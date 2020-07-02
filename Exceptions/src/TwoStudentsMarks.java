import java.util.Scanner;
class ownException extends Exception
{
	String message;
	public ownException(int marks1,int marks2) {
		// TODO Auto-generated constructor stub
		if(marks1<0||marks2<0)
			message = "negative marks";
		else
			message = "out of range";
	}
	public String toString()
	{
		return message;
		
	}
}
public class TwoStudentsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.println("enter name student1");
   String student1 = sc.next();
   System.out.println("enter name student2");
   String student2 = sc.next();
  
	for(int i =1;i<=3;i++)
	{ try {
		System.out.println("enter masrks");
		int marks1 = sc.nextInt();
		int marks2 = sc.nextInt();
		if(marks1<0||marks2<0||marks1>100||marks2>100)
		{
			throw new ownException(marks1, marks2);
	      }
	}
		catch (Exception e) {
			System.out.println(e+" "+e.getClass().getName());//like predefined can't program detect user defined
		// by above method we can know child class name even it is referenced by parent
		}
	}
		sc.close();
	} 
	}


