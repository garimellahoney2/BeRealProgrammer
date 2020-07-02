import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyingOneFileToAnother {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter file names");
		String file1 = new String();
		String file2 = new String();
		Scanner sc = new Scanner(System.in);
		file1 = sc.next();
		file2 = sc.next();
		BufferedReader fr = new BufferedReader(new FileReader(file1));
		FileWriter fw = new FileWriter(file2);
		String c;
		while((c = fr.readLine())!= null)//don't write space
		{
			fw.write(c);     //even just file writer can write
			
		}
		System.out.println("Success");
		fw.close();
		fr.close();
	}

}
