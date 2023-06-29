package BinarySearchQuestions;

public class Count_Negative_Numbers {

    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3},
        };
        int ans = countNegatives(grid);
        System.out.println(ans);
    }

    public static int countNegatives(int[][] grid) {
        int n=grid.length,m=grid[0].length, row=0, column=m - 1,ans=0;
        while (row < n) {
            while (column >= 0 && grid[row][column] < 0) column--;
            ans += m - column - 1;
            row++;
        }
        return ans;
    }
}
