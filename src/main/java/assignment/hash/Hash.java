package assignment.hash;
import java.util.*;
import java.util.logging.Logger;

public class Hash 
{
    public static void main( String[] args )
    {
        HashMap<String,Integer> has = new HashMap<String,Integer>();
        Logger log1 = Logger.getLogger("hi");
        has.put("Vaigai EXP", "06:30");
        has.put("Pandian EXP","07:00");
        has.put("Chennai EXP","19:00");
        log1.log(Level.INFO,()->"Entries are"+has);
        log1.log(Level.INFO,()->+has.get("Vaigai EXP"));
        HashMap<String,Integer> has2 = new HashMap<String,Integer>();
        has2.putAll(has);
        log.info("Values after adding another hashmap values"+String.valueOf(has2));
        log.info("Size is "+String.valueOf(has2.size()));
        Set<?> s = has.entrySet();
        log.info("Print the keys"+String.valueOf(has.keySet()));
        log.info("Print the values"+String.valueOf(has.values()));
        has2.clear();
        log.info("Values after cleared"+String.valueOf(has2));
        
        
        
    }
}
