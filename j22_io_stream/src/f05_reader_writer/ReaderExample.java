package f05_reader_writer;

import java.io.*;
import java.util.Arrays;

public class ReaderExample {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("C:\\Temp\\data.hwp")) {
			
			int readData;
			/*
			while (true) {
				// 2byte에 문자 기반으로 입력
				readData = reader.read();
				// EOF == -1
				if (readData == -1) {
					break;
				}
				System.out.println(readData);
				System.out.println((char)readData);
			}
			*/
			
			char[] chars = new char[100];
			// readData 가 -1이 아닌 동안 반복
			while ((readData = reader.read(chars)) != -1) {
				System.out.println("읽은 문자 수 : " + readData);
				System.out.println(Arrays.toString(chars));
				String result = new String(chars, 0, readData);
				System.out.println(result);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
