package filereadingoperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		String location="UsingBufferedWriter.txt";
		FileReader filereader=new FileReader(location);
		BufferedReader buferedreader= new BufferedReader(filereader);
		String currentline;
		while(( currentline=buferedreader.readLine())!=null){
			System.out.println(currentline);
		}
		buferedreader.close();
		}

}
