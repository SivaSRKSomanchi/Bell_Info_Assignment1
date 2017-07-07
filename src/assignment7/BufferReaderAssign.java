package assignment7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferReaderAssign {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "siva.txt";
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullPath = path + File.separator + fileName;
		FileReader fr = new FileReader(fullPath);
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		String[] count={};
		try {
			while((text=br.readLine()) != null){
				System.out.println(text);
				count = text.split("\\s+");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(count.length);

	}

}
