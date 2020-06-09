package ByteStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		//½ºÆ®¸²
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while((i = fis.read())!=-1) {
				System.out.println(i);
			}
			System.out.println("end");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
