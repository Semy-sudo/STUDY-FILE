package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fis = new FileOutputStream("output.txt")){
			fis.write(65);
			fis.write(66);
			fis.write(99);
			fis.write(98);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
