import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputFromUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("E:/writingoutput.txt");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = new String();
		while(!(str = br.readLine()).equals("stop"))
		{
			fw.write(str);
		}
		fw.close();
		is.close();
		br.close();
	}

}