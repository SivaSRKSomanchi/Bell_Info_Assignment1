package assignment7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriterAssign {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String fileName = "siva1.txt";
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String fullPath = path + File.separator + fileName;
		FileWriter fr = new FileWriter(fullPath);
		BufferedWriter br = new BufferedWriter(fr);
		String text = "Hi, My name is Siva Somanchi. ";
		System.out.println("Please Enter ur text here: ");
		if(scan.hasNext()){
			
			text += scan.nextLine();
		}
		String replce = text;
		replce.replaceAll("Siva", "Somanchi");
		String[] numOfWords = text.split("\\s+");
		System.out.println("Num of Words: "+numOfWords.length);
		text.replaceAll("Hi", "Hello");
 		try {
			br.write(text);
			br.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

