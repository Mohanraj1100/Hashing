package assignment.hash;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {

	public static void main(String[] args) {

		TreeSet<String> t = new TreeSet<String>();
		Logger log1 = Logger.getLogger("hi");
		t.add(23);
		t.add(56);
		t.add(45);
		t.add(1);
		t.add(10);
		log1.log(Level.INFO,()-> "Values are"+ t);
		log1.log(Level.INFO,()->"Size of map"+ t.size());
		t.clear();
		log1.log(Level.INFO,()->"Values after cleared"+t);
		ArrayList<String> al = new ArrayList<String>();
		al.add(1);
		al.add(4);
		al.add(0);
		TreeSet<String> t1 = new TreeSet<String>(al);
		log1.log(Level.INFO,()->"After get elements from ArrayList"+ t1);
		

	}

}
