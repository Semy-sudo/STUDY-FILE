package StringStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output2.txt"))){
			osw.write("지금까지 자바 재미있게 공부햇어요!");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		System.out.println("정상적으로 파일에 써졌습니다");
	}

}
