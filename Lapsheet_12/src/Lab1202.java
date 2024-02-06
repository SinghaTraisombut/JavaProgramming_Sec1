import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lab1202 {public static void main(String[] args) throws IOException{
	Scanner input = new Scanner(System.in);
	System.out.print("Input Section:");
	int Section = input.nextInt();
	Header(Section);
	showListStudent(Section);
	
	
	
	
}
public static void showListStudent(int SectionInput) throws IOException{
	BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
	String tmp ="";
	while((tmp=readFile.readLine()) != null) {
		String[] data = tmp.split("\t");
		double midtemScore = Double.parseDouble(data[4]);
		double finalScore = Double.parseDouble(data[5]);
		int SectionFile = Integer.parseInt(data[3]);
		
		if(SectionFile==SectionInput) {
			System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore
					+"\t"+finalScore+findResult(midtemScore,finalScore));
		}
	}
	readFile.close();
}
public static String findResult(double midtemscore,double finalscore) {
	double totalScore = midtemscore+finalscore;
	/*if(totalScore<=40) return "Fail";
	else return "Pass";*/
	return totalScore<=40?"Fail":"Pass";
}
public static void Header(int sec) {
	System.out.println("**********************************");
	System.out.println("\tList of for Section"+ sec);
	System.out.println("**********************************");
	
}


}
