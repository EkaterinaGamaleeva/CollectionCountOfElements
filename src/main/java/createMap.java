import java.util.HashMap;
import java.util.Map;

public class createMap<E> {
    private int count;
  private  Map<E,Integer> map;
    {
        count=1;
        map=new HashMap<>();
    }

    @Override
    public String toString() {
        return "createMap{" +
                "map=" + map +
                '}';
    }

    public  Map<E,Integer> countOfElements(E element)
    {
        if (map.containsKey(element)==true){
            count++;
        }
        else {
            count=1;
        }
        map.put(element,count);
        return map;
    }
}
