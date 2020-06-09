package ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

//10바이트씩 읽기
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];//크기가 10인 배열 생성
			int i;
			while((i=fis.read(bs))!=-1) {
				for(byte b: bs) {
					System.out.print((char)b);
				}
				System.out.println(i+"바이트 읽음");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
