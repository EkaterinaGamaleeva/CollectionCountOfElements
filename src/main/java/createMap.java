import java.util.HashMap;
import java.util.Map;

public class createMap<E> {
    private int count;
    private Map<E, Integer> map;

    {
        count = 1;
        map = new HashMap<>();
    }

    @Override
    public String toString() {
        return "createMap{" +
                "map=" + map +
                '}';
    }

    public Map<E, Integer> countOfElements(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (map.keySet().contains(elements[i])) {
                count++;
                map.replace(elements[i], count);
            }
            else  {
                count=1;
                map.put(elements[i], count);
            }
        }
return map;
    }
}