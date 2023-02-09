package assignment.hash;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.logging.*;

public class Hashset {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Logger log=Logger.getLogger("hi");
		hs.add(5);
		hs.add(50.23);
		hs.add(500);
		hs.add(52);
		hs.add(51);
		hs.add(5);
		log.info("Elements are"+String.valueOf(hs));
		hs.remove(51);
		log.info("After removing the elements are"+String.valueOf(hs));
		log.info("Size of Hashset is "+String.valueOf(hs.size())); 
		LinkedList ll = new LinkedList();
		ll.add(23);
		ll.add(45);
		ll.add("hi");
		ll.add('c');
		ll.add(23);
		log.info("Values in LinkedList"+String.valueOf(ll));
		
		HashSet hs1 = new HashSet(ll);
		log.info("Values after adding linkedlist elements"+String.valueOf(hs1));
		hs1.clear();
		log.info("Values after cleared"+String.valueOf(hs1));
		log.info("Size after cleared  "+String.valueOf(hs1.size()));
		
		
		

	}

}
