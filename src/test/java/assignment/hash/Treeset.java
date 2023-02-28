package assignment.hash;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {

	void treeSet() {

		TreeSet<Integer> t = new TreeSet<Integer>();
		Logger log = Logger.getLogger("hi");
		t.add(23);
		t.add(56);
		t.add(45);
		t.add(1);
		t.add(10);
		log.info("Values are"+String.valueOf(t));
		log.info("Size of map"+String.valueOf(t.size()));
		t.clear();
		log.info("Values after cleared"+String.valueOf(t));
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(4);
		al.add(0);
		TreeSet<Integer> t1 = new TreeSet<Integer>(al);
		log.info("After get elements from ArrayList"+String.valueOf(t1));
		

	}

}
