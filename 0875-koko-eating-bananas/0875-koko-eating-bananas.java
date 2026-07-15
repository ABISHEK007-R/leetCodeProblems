class Solution {
    boolean check(int h, int[] p, int mid) {
        long k = 0;
        for (int t : p) {
            if (t % mid == 0)
                k += (t / mid);
            else
                k += (t / mid) + 1;
        }
        return k <= h ? true : false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        int ans = 0;
        for (int i = 0; i < piles.length; i++) {
            if (high < piles[i]) {
                high = piles[i];
            }
        }
        int low = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(h, piles, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}