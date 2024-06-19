import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] strings= new String[10];
       strings[0]="k";
        strings[1]="k";
        strings[2]="k";
        strings[3]="ka";
        strings[4]="ka";
        strings[5]="kc";
        strings[6]="kc";
        strings[7]="kc";
        strings[8]="kc";
        strings[9]="b";
       createMap map=new createMap();
       map.countOfElements(strings);
        System.out.println(map);

    }

}
