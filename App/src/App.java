import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.io.File;
public class App {

	public static void main(String[] args) throws IOException {
		String word;
		File wordlist = new File("/Users/Uday Indukuri/Desktop/Possible_Words.txt");
		
		Scanner input = new  Scanner(wordlist);
		int length;
		int maxLength = 0;
		String largest = "";
		
		while(input.hasNext()) {
			word = input.nextLine();
			length = word.length();
			if(length>maxLength) {
				maxLength = length;
				largest = word;
			}
		}
		System.out.println(maxLength);
		System.out.println(largest);
		/*char arr[] = new char[18];
		String s = "poultry outwits ants";
		String s_wo_space = s.replaceAll(" ", "");
		int n = s_wo_space.length();
		
		for(int i = 0; i<s_wo_space.length();i++) {
			arr[i] = s_wo_space.charAt(i);
		}
		Arrays.sort(arr);
		//System.out.println(n);
		//System.out.println(s);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		while(input.hasNextLine()){
			System.out.println(input.next());
		}*/
		
		}
	}
