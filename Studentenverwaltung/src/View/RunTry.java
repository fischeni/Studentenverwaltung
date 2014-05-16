package View;

import java.io.File;
import java.util.ArrayList;

public class RunTry {

	public static void main(String[] args) {
		
		CSV csv = new CSV();
		File test = new File("/Users/Pablo/Documents/Git/Studentenverwaltung/Studentenverwaltung/src/View/stud_info.csv");
//		System.out.println(csv.read(test));
		ArrayList<ArrayList<String>> list = csv.read(test);
		ArrayList<String> ich = new ArrayList<String>();
		ich.add("nils");
		ich.add("fischer");
		int i = list.size();
		//list.remove(i);
		list.add(ich);
		System.out.println(list);
		csv.write(test, list);
		System.out.println(csv.read(test));
		
		
	}

}
