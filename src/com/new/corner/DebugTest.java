import java.util.HashMap;

/**
 * @author shkstart
 * @date 2021/3/3 -  21:16
 */
public class DebugTest {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","17");
        map.put("school","qinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
