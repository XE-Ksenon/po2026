package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public int countEvens(int[] nums) {
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                n++;
            }
        }

        return n;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String valA = map.get("a");
            String valB = map.get("b");
            map.put("ab", valA + valB);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }
}
