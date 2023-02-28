package assignment.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.*;

public class Hashset {

	void hashSet() {
		HashSet<Integer> hst = new HashSet<Integer>();
		Logger log=Logger.getLogger("hi");
		hst.add(5);
		hst.add(500);
		hst.add(52);
		hst.add(51);
		hst.add(5);
		log.info("Elements are"+String.valueOf(hst));
		hst.remove(51);
		log.info("After removing the elements are"+String.valueOf(hst));
		log.info("Size of Hashset is "+String.valueOf(hst.size())); 
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("how");
		ll.add("are");
		ll.add("you");
		ll.add("?");
		log.info("Values in LinkedList"+String.valueOf(ll));
		
		HashSet<String> hs1 = new HashSet<String>(ll);
		log.info("Values after adding linkedlist elements"+String.valueOf(hs1));
		hs1.clear();
		log.info("Values after cleared"+String.valueOf(hs1));
		log.info("Size after cleared  "+String.valueOf(hs1.size()));
		
		
		

	}

}
