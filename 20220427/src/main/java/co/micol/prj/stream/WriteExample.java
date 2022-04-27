package co.micol.prj.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample { // 
		// 멤버변수 정의
		// 생성자 정의
		// 멤버 메소드
	public void run() {
		try { // 실행하는 내가 exception을 처리 //가급적이면 try이를 써라
			OutputStream os = new FileOutputStream("c:\\Temp\\test1.txt");
			byte[] arr = {'A','B','C'};
			os.write(arr);
			os.flush();
			os.close();
		} catch (Exception e) { 
			e.printStackTrace();			
		}
	}
}
