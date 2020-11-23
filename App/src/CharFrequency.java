import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) throws IOException {
		String s = "poultry outwits ants";
		String s_wo_space = s.replaceAll(" ", "").trim();
		
		File textfile = new File("/Users/Uday Indukuri/Desktop/Possible_TwoWords_Anagram.txt");
		Scanner input = new  Scanner(textfile);
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		String TwoWord_Anagrams = "";
		
		//Insert values in hashmap.
		for(int i=0; i<s_wo_space.length();i++) {
			char c = s_wo_space.charAt(i);
			Integer val = hm.get(c);
			
			if(val != null) {
				hm.put(c, Integer.valueOf(val + 1));
			}
			else {
				hm.put(c, 1);
			}
		}
				
		while(input.hasNext()) {
		String word = input.nextLine();
			if(isPossible(word,hm)) {
				
				TwoWord_Anagrams = TwoWord_Anagrams.concat(word + "\n");
			}
		}
		
		FileWriter writer = new FileWriter("/Users/Uday Indukuri/Desktop/TwoWord_Anagrams.txt");
		writer.write(TwoWord_Anagrams);
		writer.close();
		System.out.println(TwoWord_Anagrams);
	}
	public static boolean isPossible(String word, HashMap<Character, Integer> hm) {
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		hm2.putAll(hm);
		//System.out.println(word);
		boolean res = true;
	for(int j=0;j<word.length()-1;j++) {
		char ch = word.replaceAll(" ", "").trim().charAt(j);
		int val = hm2.get(ch);
		//System.out.print(val+ " ");
		if(val >= 0) {
			hm2.put(ch, Integer.valueOf(val - 1));
		}
		else {
			res = false;
		}
		for(int c:hm2.values()) {
			if(c<0) {
				res = false;
			}
		}
	}
	return res;
}
}
