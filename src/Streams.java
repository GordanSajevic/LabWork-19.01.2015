import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;


public class Streams {

	public static void main(String[] args) {
		
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		byte[] buffer = new byte[4];
		BufferedReader bis = new BufferedReader(read);
		//BufferedInputStream bis = new BufferedInputStream(System.in);
		int numBytesRead = 0;
		CharBuffer javaCharBuffer = CharBuffer.allocate(4);
		try 
		{
			dis.mark(4);
		/*	while((numBytesRead = dis.read(buffer)) >= 0)
			{
				System.out.println("Pročitali: " + numBytesRead + " bajta\n" + new String(buffer));
				buffer = new byte[buffer.length];
				dis.reset();
			} */
		/*	while(read.read(javaCharBuffer) >= 0)
			{
				System.out.println(javaCharBuffer.toString());
			} */
			String line = "";
			while((line = bis.readLine()) != null)
			{
				System.out.println(line);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
