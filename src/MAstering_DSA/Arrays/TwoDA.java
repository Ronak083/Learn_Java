package MAstering_DSA.Arrays;
public class TwoDA {
    int[][] arr = null;
    public TwoDA(int m, int n){
        arr = new int[m][n];
        System.out.println("2D Array Created Successfully");
    }

    public void insert(int l1, int l2, int value){
        try {
            if (arr[l1][l2] == 0) {
                arr[l1][l2] = value;
                System.out.println("Successfully Inserted");
            }
            else {
                System.out.println("Space Already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Location");
        }

    }

    public void Traverse(){
        for (int i= 0; i<arr.length;i++){
            for (int j= 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
