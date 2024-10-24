
import java.util.HashMap;

public class itinarary {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revTicket = new HashMap<>();
        for (String city : tickets.keySet()) {
            revTicket.put(tickets.get(city), city);
        }
        for (String city : tickets.keySet()) {
            if (!revTicket.containsKey(city)) {
                return city;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "mysore");
        tickets.put("delhi", "bengaluru");
        tickets.put("bengaluru", "goa");
        tickets.put("goa", "chennai");
        String start = getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
          System.out.print(" -> "+tickets.get(start));
          start = tickets.get(start);
        }
    }
}
