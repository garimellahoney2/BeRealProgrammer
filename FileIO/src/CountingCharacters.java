import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountingCharacters {
//ask
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("enter file name");
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		FileReader fr = new FileReader(str);//don't five "" these in file name it gets error
		int c;
		int count = 0;
		System.out.println("enter character");
		char c1 = sc.next().charAt(0);
		while((c = fr.read())!=-1)//don't write space
		{
			if((char)c==c1)
				count += 1;
			
		}
		System.out.print(count);
		fr.close();

	}

}
