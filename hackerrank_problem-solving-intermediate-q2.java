import java.util.*;

public class Solution {
    private static final int P = 131;
    private static final int M = 1000000007;
    private static String currentPassword = "";
    private static long currentHash = 0;

    public static List<Integer> authEvents(List<List<String>> events) {
        List<Integer> result = new ArrayList<>();
        for (List<String> event : events) {
            String type = event.get(0);
            String param = event.get(1);
            if (type.equals("setPassword")) {
                setPassword(param);
            } else if (type.equals("authorize")) {
                int x = Integer.parseInt(param);
                result.add(authorize(x));
            }
        }
        return result;
    }

    private static void setPassword(String s) {
        currentPassword = s;
        currentHash = computeHash(s);
    }

    private static int authorize(int x) {
        if (x == currentHash) {
            return 1;
        }
        for (char c = 0; c < 128; c++) {
            long newHash = (currentHash * P + c) % M;
            if (newHash == x) {
                return 1;
            }
        }
        return 0;
    }

    private static long computeHash(String s) {
        long hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = (hash * P + s.charAt(i)) % M;
        }
        return hash;
    }
}
