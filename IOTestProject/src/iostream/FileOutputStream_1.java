package iostream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		File outFile = new File("D:\\java7\\java_test\\test_out1.txt");
		OutputStream os1 = new FileOutputStream(outFile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\n');
		os1.write('힇');
		os1.write('홯');
		os1.write('휅');
		os1.write('뀖');
		os1.flush();
		os1.close();
		
		System.out.println("저장되었습니다.");
	}

}
