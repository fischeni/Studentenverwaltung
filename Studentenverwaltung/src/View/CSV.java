package View;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV {
	
	
	public static ArrayList<ArrayList<String>> read(File file)
	{
		ArrayList<ArrayList<String>> csv = new ArrayList<ArrayList<String>>();
		ArrayList<String> part;
		String line;
		String space[];
		
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			
			try {
				while ((line=br.readLine()) != null)
				{
					part = new ArrayList<String>();
					space = line.split(",");
					
					for ( String item : space)
					{
						part.add(item);
					}
					csv.add(part);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return csv;
	}
	
	
	
	
	static void write (File file, ArrayList<ArrayList<String>> list)
	{
		String value;
		
		
		try {
			FileWriter fdel = new FileWriter(file);
			fdel.write("");
			fdel.flush();
			fdel.close();
			
			
			FileWriter fw = new FileWriter(file);
			
			for (int i=0;i<list.size();i++)
			{
				value ="";
				for (int j=0;j<list.get(i).size();j++)
				{
					value= value + list.get(i).get(j);
				}
				fw.write(value+"⁄n");
			}
			
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
