class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (b[1] - b[0]) - (a[1] - a[0]);
            }
        });
        int sum = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            sum += costs[i][0] + costs[costs.length - i - 1][1];
        }
        return sum;
    }
}
