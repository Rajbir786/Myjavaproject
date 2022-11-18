
package gamingApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import assignmentWeek11.Item;

public class TextFile {
	public static void main(String[] args)throws Exception {
		File file = new File("C:\\Users\\Rajbir\\Downloads\\phase-1.txt");
		ArrayList<Item> allData = new ArrayList<>();//
		String inputLine;

		BufferedReader readFile = new BufferedReader(new FileReader(file));
		while ((
				inputLine=readFile.readLine()) !=null) // It checks if the file reader is ready to be read.
		{
			String[] data=inputLine.split("=");
			allData.add( new Item(data[0],Integer.parseInt(data[1])));//
		}
		readFile.close();//
		for(Item ed:allData) {
			//System.out.println(ed.getname());
			System.out.println(ed.getWeight());
			
			
		}
		//System.out.println(allData[0].name);
		 }
		kj b
		
		

		
	
    }
	

