import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		long n;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String line = br.readLine();
		while (line != null)
		{
			n = Long.parseLong(line);
            System.out.println(n - 1);
			line = br.readLine();
		}
	}
}
