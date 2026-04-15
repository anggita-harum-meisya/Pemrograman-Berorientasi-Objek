import java.util.Map;
import java.util.TreeMap;

public class latihan3 {
    public static void main(String[] args) {

        Map<String, String> data = new TreeMap<>();

        data.put("Microsoft", "Bill Gates");
        data.put("Apple", "Steven Paul Jobs");
        data.put("Linux", "Linux Benedict Torvalds");
        data.put("Facebook", "Mark Zuckerberg");
        data.put("Twitter", "Jack Dorsey");
        data.put("Instagram", "Kevin Systrom");

        int no = 1;
        for (String key : data.keySet()) {
            System.out.println(no + ". "
                + key.toUpperCase()
                + " dikembangkan oleh "
                + data.get(key));
            no++;
        }
    }
}