package iOOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*File Word Count
Implement a code to count the occurrences of each word in an input file and write 
the word along with corresponding count in an output file sorted by the words alphabetically. 
(Hint : Use Map as an intermediate collection)
Sample Input
inputFile.txt
Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro
Sample Output
D:\>Java FileWordCount inputFile.txt outputFile.txt
outputFile.txt
Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6*/
public class P1 {

	public static void main(String[] args) {
		String fileName = "E:\\pranavJava\\javaProjects\\src\\iOOperations\\inputFile.txt";
		File file = new File(fileName);
		String para="";
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null){
				
				para=para.concat(" ");
				para=para.concat(line);
			}
		}
		catch (Exception e) {
			System.out.println("Error in reading the file or file not found");
		}
		
		String words[]=para.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(words[i].equals("")) {
				words[i]="0";
			}
		}
		
		int count=1;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {

				if(words[i].equals(words[j])) {
					++count;
					words[j]="0";
				}
			}
			if(words[i]!="0") {
				System.out.println(words[i]+"->"+count);
			}
			count=1;
		}
		
	}
}
