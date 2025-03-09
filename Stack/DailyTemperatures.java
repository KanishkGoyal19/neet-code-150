class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[]ans = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i =0; i<temperatures.length;i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t>stack.peek()[0]){
                int[] pair = stack.pop();
                ans[pair[1]] = i -pair[1];
            }
            stack.push(new int[]{t,i});

        }
        return ans;
    }
}
