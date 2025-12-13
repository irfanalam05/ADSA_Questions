import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        List<String[]> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            // Condition1 coupon must be active
            if (!isActive[i]) continue;

            // Condition2 valid business line
            if (!order.containsKey(businessLine[i])) continue;

            // Condition3  valid code (non-empty, alphanumeric + underscore)
            if (code[i].isEmpty() || !code[i].matches("[a-zA-Z0-9_]+")) continue;

            validCoupons.add(new String[]{businessLine[i], code[i]});
        }

        validCoupons.sort((a, b) -> {
            int cmp = order.get(a[0]) - order.get(b[0]);
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });

        List<String> result = new ArrayList<>();
        for (String[] c : validCoupons) {
            result.add(c[1]);
        }

        return result;
    }
}
