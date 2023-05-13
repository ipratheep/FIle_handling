package fileHandling;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileHandling {
	
	
	
	static void ReadFile(String path) {
		try {
			File file = new File(path);
			Scanner reader = new Scanner(file);
			      
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());     
			 }
			}
		catch(Exception E) {
			System.out.println(E);
		}
	}
	
	
	static void WriteFile(String path) {
		try {
			File file = new File(path);
			FileWriter write = new FileWriter(file);
			System.out.println("Enter the content : ");
			Scanner scan = new Scanner(System.in);
			String put = scan.nextLine();
			write.write(put);
			write.close();

			}
		catch(Exception E) {
			System.out.println(E);
		}
		
	}
	
	
	static void AppendFile(String path) {
		
		System.out.println("Enter the content : ");
		Scanner scan = new Scanner(System.in);
		String content = scan.nextLine();
		try {
			Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.APPEND);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

	public static void main(String[] args) {	
		System.out.println("Enter file name with absolute path : ");
		Scanner get = new Scanner(System.in);
		String path = get.nextLine();
		WriteFile(path);	
		ReadFile(path);
		AppendFile(path);
		}
		
	

}
