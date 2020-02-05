package exercise6;

import java.io.*;

public class wordcount {

	public wordcount(File f) throws IOException {
		// TODO Auto-generated constructor stub
		FileReader fr=new FileReader(f.getName());
		BufferedReader bf=new BufferedReader(fr);
		int charCount=0;
		int lineCount=0;
		int wordCount=0;
		String s;
		
		while((s=bf.readLine())!=null)
		{
			lineCount++;
			charCount+=s.length();
			String []arr=s.split("\\s+");
			wordCount+=arr.length;
		}
//		fr.close();
		System.out.println(f.length());

		System.out.println("line count : "+lineCount);
		System.out.println("word count : "+wordCount);
		System.out.println("character count : "+charCount);
		
		
//		BufferedInputStream bis=new BufferedInputStream();
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("sample.txt");
		wordcount wc=new wordcount(f);

	}

}
