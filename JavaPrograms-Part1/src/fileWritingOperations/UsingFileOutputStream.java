package fileWritingOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
String location="Using FOS.txt";
String content="i can learn automation quickly";
FileOutputStream outputstream=new FileOutputStream(location);
byte[] writethis=content.getBytes();
outputstream.write(writethis);
outputstream.close();

}

}
