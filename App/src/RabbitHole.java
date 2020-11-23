import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RabbitHole {
	public static void main(String[] args) throws IOException {
		String phrase = "poultry outwits ants";
		String new_phrase = phrase.replaceAll(" ", "").trim();
		int phrase_length = new_phrase.length();
		int max_len = 11;
		String[] words = new String[1788];
		File wordlist = new File("/Users/Uday Indukuri/Desktop/Possible_Words.txt");
		Scanner input = new  Scanner(wordlist);
		int k=0;
		while(input.hasNext()) {
			
			words[k] = input.nextLine();
			k++;
		}
		
		while(max_len>0) {
			for(int i=0;i<words.length;i++) {
				for(int j=0;j<words.length;j++) {
				if(words[i].length() == max_len && words[j].length() == phrase_length - max_len) {
					System.out.println(words[i] + " " + words[j]);
				}
			}}
			max_len--;
		}
		
	}
}
