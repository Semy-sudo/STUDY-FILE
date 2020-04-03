package StringStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try (FileReader fis = new FileReader("input3.txt")){
			int i;
			while((i=fis.read())!=-1) {
				//System.out.println(i);
				System.out.println((char)i);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일을 문자열로 다 읽어왔습니다");

	}

}
