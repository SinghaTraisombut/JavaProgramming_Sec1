import java.util.*;
import java.io.*;
public class Sentencetext {

	public static void main(String[] args)throws IOException{
		PrintStream writeFile = new PrintStream((new File("d://txFile//")));
		Scanner input = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.println("Sentence: ");
			String word = input.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			writeFile.println(word);
			i++;
		}
		System.out.print("File is save!!");
		writeFile.close();
	
		
	}

}
