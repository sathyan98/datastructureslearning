import java.util.*;
import java.util.stream.*;
public class Lists {
    public static void main(String[] args)
    {
        List<String>cars = new ArrayList<String>(5);
        cars.add("BMW m3");
        cars.add("audi a8");
        cars.add("buggati");
        cars.add("ford");
        cars.add("chevrolet");
        System.out.println("THE CARS ARE" + cars.get(1));
        Map<String,Integer>carno = new HashMap<String, Integer>();
        carno.put("Bmw",2888);
        carno.put("audi a8",2322);
        carno.put("Buggatti",2213);
        carno.put("ford",8997);
        carno.put("chevrolet",7878);
        System.out.println(carno.entrySet());
        List<String>keys = null;
        List<Integer>values = null;
        keys = carno.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
        values = carno.values().stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(keys);
        System.out.println(values);



    }

}
