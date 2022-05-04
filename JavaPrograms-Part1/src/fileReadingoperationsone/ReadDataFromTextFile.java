package fileReadingoperationsone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws FileNotFoundException {
// APPROACH1 USING FILE READER AND BUFFERED READER
		// FileReader fr = new FileReader("D:\\demofile.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String str;
//		try {
//			while ((str = br.readLine()) != null) {
//				System.out.println(str);
//			}
//			br.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		}
// APPROACH2    USING scanner and file
//		File file = new  File("D:\\demofile.txt");
		// Scanner sc=new Scanner(file);
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}

		// APPROACH 3 USING DELIMETER
		File file = new File("D:\\demofile.txt");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());

	}

}
