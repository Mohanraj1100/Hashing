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
        log1.log(Level.INFO,()->"Values after adding another hashmap values"+has2);
        log1.log(Level.INFO,()->"Size is "+has2.size());
        log1.log(Level.INFO,()->"Print the keys"+has.keySet());
        log1.log(Level.INFO,()->"Print the values"+has.values());
        has2.clear();
        log1.log(Level.INFO,()->"Values after cleared"+has2);
        
        
        
    }
}
