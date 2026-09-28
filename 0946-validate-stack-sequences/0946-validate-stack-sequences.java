class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> s = new Stack<>();
        int j = 0;

        for (int input : pushed) {

            s.push(input);

            while (!s.isEmpty() && j < popped.length && s.peek() == popped[j]) {
                s.pop();
                j++;
            }
        }

        return s.isEmpty();
    }
}