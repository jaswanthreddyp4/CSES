import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CountingRooms {
    static void dfs(int row,int column,boolean[][] visited,char[][] mat){
        visited[row][column]=true;

        int[] x_dirs={-1,0,1,0};
        int[] y_dirs={0,1,0,-1};

        for(int i=0;i<4;i++){
            int newRow=row+x_dirs[i];
            int newColumn=column+y_dirs[i];

            if(newRow>=0 && newRow<mat.length && newColumn>=0 && newColumn<mat[0].length){
                if(!visited[newRow][newColumn] && mat[newRow][newColumn]=='.'){
                    dfs(newRow,newColumn,visited,mat);
                }
            }
        }

    }
   static int solve(char[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int count=0;

        boolean[][] visited=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && mat[i][j]=='.'){
                    count++;
                    dfs(i,j,visited,mat);
                }
            }
        }
        return count;
    }

    static int bfs(char[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited = new boolean[m][n];

        int count = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                // If we find an unvisited '.', it's a new region
                if(!visited[i][j] && mat[i][j] == '.') {
                    count++;

                    Queue<int[]> que = new LinkedList<>();
                    que.add(new int[]{i,j});
                    visited[i][j] = true; // Mark visited at enqueue

                    // BFS traversal
                    while(!que.isEmpty()) {
                        int[] curr = que.poll();
                        int row = curr[0];
                        int col = curr[1];

                        int[] x_dirs = {-1, 0, 1, 0};
                        int[] y_dirs = {0, 1, 0, -1};

                        for(int k = 0; k < 4; k++) {
                            int newRow = row + x_dirs[k];
                            int newCol = col + y_dirs[k];

                            if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                                // If neighbor is '.', not visited => enqueue
                                if(!visited[newRow][newCol] && mat[newRow][newCol] == '.') {
                                    visited[newRow][newCol] = true;
                                    que.add(new int[]{newRow,newCol});
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] mat = new char[m][n];

        for (int i = 0; i < m; i++) {
            // Read a full line of n characters
            String row = br.readLine();
            // Fill the row into the char[][] array
            for (int j = 0; j < n; j++) {
                mat[i][j] = row.charAt(j);
            }
        }
        System.out.println(bfs(mat));
    }
}
