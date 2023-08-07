//PROGRAM TO PRINT THE PATHS TO GET FROM ONE POINT TO ANOTHER POINT IN A GIVEN N * M MAZE WITH RESTRICTIONS

class Scratch {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
    }
    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
                return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathRestrictions(p + 'D', maze, r + 1, c);
        }
        if(c < maze.length - 1){
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }
}
