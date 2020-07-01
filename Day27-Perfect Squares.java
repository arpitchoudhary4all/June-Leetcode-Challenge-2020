class Solution {
    public int numSquares(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i*i<n; ++ i) {
            list.add(i*i);                                
        }
        int depth = 1;
        Deque<Integer> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; -- i) {
                n = queue.poll();
                for (int j = list.size() - 1; j >= 0; -- j) {
                    int diff = n - list.get(j);
                    if (diff == 0) {
                        return depth;
                    }
                    if (diff > 0) {
                        queue.offer(diff);
                    }
                }
            }
            depth = depth + 1;
        }
        return depth;
    }
}
