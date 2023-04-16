class Solution {
public int minimumTotal(List<List<Integer>> t) {
    int n = t.size();
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
        ans[i] = t.get(n - 1).get(i);
    }
    for (int i = n - 2; i >= 0; i--) {
        List<Integer> c = t.get(i);
        for (int j = 0; j < c.size(); j++) {
            ans[j] = c.get(j) + Math.min(ans[j], ans[j + 1]);
        }
    }
    return ans[0];
}

}
