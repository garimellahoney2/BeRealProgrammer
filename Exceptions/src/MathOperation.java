
public class MathOperation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length<=5)
		{
			try
			{
			int arr[] = new int[args.length];
			int sum = 0;
			for(int i =0;i<args.length;i++)
			{
				arr[i] = Integer.parseInt(args[i]);
				sum += arr[i];
			}
			int average = sum/args.length;
			System.out.println(" sum is "+sum+" average is "+average);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("should be less than or equal to 5");
		}

	}

}
