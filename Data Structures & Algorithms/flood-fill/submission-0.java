class Solution {
    int n;
    int m;
    private void dfs(int image[][] , int i , int j ,int newColor , int ogColor){
 // base case 
        if (i < 0 || i >= n || j < 0 || j >= m || image[i][j] == newColor || image[i][j] != ogColor) {
            return;
        }

        image[i][j] = newColor;
        // explore 
        dfs(image, i - 1, j, newColor, ogColor); //up
        dfs(image, i + 1, j, newColor, ogColor); //down
        dfs(image, i, j + 1, newColor, ogColor); //right
        dfs(image, i, j - 1, newColor, ogColor); //left
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         n = image.length;
         m = image[0].length;

        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}