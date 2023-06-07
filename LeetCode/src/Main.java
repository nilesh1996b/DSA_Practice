public class Main {
    public static void main(String[] args) {
//       int[][] cor = {{1, 2}, {2, 3},{3, 4},{4, 5},{5, 6},{6, 7}};
//        int[][] cor = {{0,0},{0,1},{0,-1}};
//        [[2,1],[4,2],[6,3]]

        int[][] cor = {{2,1},{4,2},{6,3}};

        // same aur

       int count = 0;
       int count2 = 0;

        int key = Math.abs(cor[0][1] - cor[0][1]);
        int key2 = Math.abs(cor[0][0] - cor[1][0]);

       for(int i = 0; i<cor.length-1; i++) {
           if((Math.abs(cor[i][1] - cor[i+1][1]) == key && cor[i][1] == cor[i+1][0]) || ((Math.abs(cor[i][0] - cor[i+1][0]) == 1)&& (cor[i][0] == cor[i][1])) || (cor[i][0] == cor[i+1][0])
                   || ((Math.abs(cor[i][1] - cor[i+1][1]) == key) && Math.abs(cor[i][0] - cor[i+1][0])==key2)) {
               count2++;
           } else {
               count++;
           }
       }

        if(count==0)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}

// || (Math.abs(cor[i][0] - cor[i+1][0]) == 1 && (cor[i][0] == cor[i+1][1]))