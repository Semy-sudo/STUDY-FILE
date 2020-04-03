package StringStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output2.txt"))){
			osw.write("���ݱ��� �ڹ� ����ְ� �����޾��!");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

		System.out.println("���������� ���Ͽ� �������ϴ�");
	}

}
