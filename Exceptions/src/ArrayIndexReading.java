import java.util.Scanner;

public class ArrayIndexReading {
public static void main(String[] args) {
int arr[] = {0,1,2};
System.out.println("enter no of times");
Scanner sc = new Scanner(System.in);
int no_of_times = sc.nextInt();
for(int i = 1;i<=no_of_times;i++)
{
try
{
	System.out.println("enter index");
	int index = Integer.parseInt(sc.next());//to get exception in question
	System.out.println(arr[index]);
	System.out.println("accessed successfully");
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
}
}
/*
 * InputMismatchException is specific for the Scanner. It indicates invalid type, not necessarily an invalid number. 
 * NumberFormatException is specific for trying to convert a non numeric string to a number.*/
}
