package Code;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5},
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        //person = row
        //account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //when you start a new col,take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            //check with overall ans
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }


}
