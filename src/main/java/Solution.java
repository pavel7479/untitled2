import java.util.*;

public class Solution {
    public static String wordAppend(String[] strings) {
        String str = "";
        Map <String, Integer> map = new HashMap <String, Integer> ();
        for (String s: strings) {
            if (! map.containsKey (s)) {
                map.put (s, 1);
            }
            else {
                int count = map.get (s);
                map.put (s, count + 1);
                System.out.println("count = " + count);
                if (map.get(s) == 2) {
                    System.out.println("test");
                    str = str + s;
                    map.remove(s);
                }
            }
        }
        System.out.println(map);
        System.out.println(str);
        return str;
    }


    public static void main(String[] args) {
        String[] strings = {"a", "b", "a"};
        wordAppend(strings);
    }
}

