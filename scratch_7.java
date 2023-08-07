//PROGRAM TO PRINT THE PATHS TO GET FROM ONE POINT TO ANOTHER POINT IN A GIVEN N * M MAZE

class Scratch {
    public static void main(String[] args) {
        path("", 3, 4);
    }
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p + 'D', r - 1, c);
        }
        if(c>1){
            path(p + 'R', r, c - 1);
        }
    }
}