public class jagged_array {
    public static void main(String[] args) 
    {
        int num[][] = new int[4][];// it will create 4 rows of array but not allocate num of column
        num[0] = new int[3];// allocate 3 block for row 0
        num[1] = new int[2];// allocate 2 block for row 0
        num[2] = new int[6];// allocate 6 block for row 0
        num[3] = new int[4];// allocate 4 block for row 0

        for(int i = 0; i<num.length;i++){
            for(int j = 0; j<num[i].length;j++){
                num[i][j] = (int)(Math.random()*10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
