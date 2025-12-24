class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            stack.push(num);
            // keep merging while top 2 are non co-prime
            while (stack.size() > 1) {
                int a = stack.pop();
                int b = stack.pop();

                int g = gcd(a, b);
                if (g > 1) {
                    stack.push(lcm(a, b));
                } else {
                    stack.push(b);
                    stack.push(a);
                    break;
                }
            }
        }
        return new ArrayList<>(stack);
    }

    private int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd (b, a % b);
    }

    private int lcm(int a, int b){
        return a / gcd(a,b) * b;
    }
}