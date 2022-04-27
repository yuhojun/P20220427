package co.micol.prj.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class ReadExample {
		public void run() {
		try {
			InputStream is = new FileInputStream("c:\\temp\\test.txt");

			byte[] buffer = new byte[100]; // 버퍼 선언 방법
			while (true) {
				int data = is.read();
				if (data == -1)
					break;
				System.out.println(data);
				for (int i = 0; i < data; i++)
				System.out.println(buffer[i]);

			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
