package assignment.hash;
import java.util.*;
import java.util.logging.Logger;

class Hashmap 
{
    void hashMap()
    {
        HashMap<String,String> has = new HashMap<String,String>();
        Logger log = Logger.getLogger("hi");
        has.put("Vaigai EXP", "06:30");
        has.put("Pandian EXP","07:00");
        has.put("Chennai EXP","19:00");
        log.info("Entries are"+String.valueOf(has));
        log.info(String.valueOf(has.get("Vaigai EXP")));
        HashMap<String,String> has2 = new HashMap<String,String>();
        has2.putAll(has);
        log.info("Values after adding another hashmap values"+String.valueOf(has2));
        log.info("Size is "+String.valueOf(has2.size()));
        Set<Map.Entry<String, String>> s = has.entrySet();
        log.info("Print the keys"+String.valueOf(has.keySet()));
        log.info("Print the values"+String.valueOf(has.values()));
        has2.clear();
        log.info("Values after cleared"+String.valueOf(has2));
        log.info("Set is"+String.valueOf(s));
        
        
        
    }
}
