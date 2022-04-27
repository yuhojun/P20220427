package co.micol.prj.stream;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public void run() {
		try {
			Reader reader = new FileReader("c:\\temp\\test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.println((char)data);
			}
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
