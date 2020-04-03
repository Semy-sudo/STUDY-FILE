package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) {
	//FileOutputStream fis = new FileOutputStream("output.txt");
	try(FileOutputStream fis = new FileOutputStream("output.txt")){
		byte[] bis = new byte[10];
		byte data = 65;
		for(int i=0;i<bis.length;i++) {
			bis[i] = data;
			data++;
		}
		fis.write(bis);
	}catch(IOException e){
		e.printStackTrace();
	}
	System.out.println("출력이 완료되었습니다");
	}
}
