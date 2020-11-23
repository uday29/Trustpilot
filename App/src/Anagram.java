import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Snippet {
	public static void main(String[] args) throws IOException {
		String phrase = "poultry outwits ants";
		File textfile = new File("/Users/Uday Indukuri/Desktop/wordlist (1)");
		Scanner input = new  Scanner(textfile);
		String phrase_wo_space = phrase.replaceAll(" ", "");
	    String word = "";
	    String New_WordList = "";
		
		while(input.hasNext()) {
			word = input.nextLine();
			if(containsAllChars(phrase_wo_space, word)) {
				New_WordList = New_WordList.concat(word + "\n");
			}
		}
		
		FileWriter writer = new FileWriter("/Users/Uday Indukuri/Desktop/New_WordList.txt");
		writer.write(New_WordList);
		writer.close();
		System.out.println(New_WordList);
		
	}
	public static Set<Character> stringToCharacterSet(String s) {
	    Set<Character> set = new HashSet<>();
	    for (char c : s.toCharArray()) {
	        set.add(c);
	    }
	    return set;
	}

	public static boolean containsAllChars
	    (String container, String containee) {
	    return stringToCharacterSet(container).containsAll
	               (stringToCharacterSet(containee));
	}
}

