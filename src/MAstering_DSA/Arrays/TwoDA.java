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
        for(int i= 0; i<arr.length;i++){
            for (int j= 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void Delete(int l1, int l2){
        arr[l1][l2]= 0;
        System.out.println("Successfully Deleted");
    }
    public void Search(int value){
        for (int i =0 ; i<arr.length; i++){
            for (int j =0 ; j<arr.length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Successfully Found");
                }
            }
        }
    }
    public void RotateMatrix(){

        //Edges
        int temp = arr[0][0];
        arr[0][0] = arr[2][0];
        arr[2][0] = arr[2][2];
        arr[2][2] = arr[0][2];
        arr[0][2] = temp;
        //Centers
        temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = arr[2][1];
        arr[2][1] = arr[1][2];
        arr[1][2] = temp;

        System.out.println("Matrix Successfully Rotated by 90' ");

    }
}
