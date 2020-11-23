import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) throws IOException {
			
	String Phrase = "poultry outwits ants";
	String Phrase_wo_space = Phrase.replaceAll(" ", "").trim();
	char[] Phrase_Char = Phrase_wo_space.toCharArray();
	
	String[] words = new String[13];
	String ThreeWords_Anagram = "";
	Arrays.sort(Phrase_Char);

	File textfile = new File("/Users/Uday Indukuri/Desktop/Possible_3Word_Anagram.txt");
	Scanner input = new  Scanner(textfile);
	int z = 0;
	while(input.hasNext()) {
		
		words[z] = input.nextLine();
		z++;
	}

	for(int i=0;i<words.length;i++) {
		
		String	Possible_Phrase = 	words[i];
		
		char[] Possible_Phrase_Char = Possible_Phrase.replaceAll(" ", "").trim().toCharArray();
	
		  Arrays.sort(Possible_Phrase_Char);
		  
		  if(Arrays.equals(Phrase_Char, Possible_Phrase_Char)){
			  ThreeWords_Anagram = ThreeWords_Anagram.concat(Possible_Phrase + "\n");
		  }
		
		
	}
	
	FileWriter writer = new FileWriter("/Users/Uday Indukuri/Desktop/ThreeWords_Anagram.txt");
	writer.write(ThreeWords_Anagram);
	writer.close();
	System.out.println(ThreeWords_Anagram);
}
}