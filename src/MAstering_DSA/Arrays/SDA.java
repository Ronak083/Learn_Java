package MAstering_DSA.Arrays;

public class SDA {
    int[] arr = null;
    public SDA(int Size){
        arr = new int[Size];
        System.out.println("1D Array Created Successfully");
    }
    public void Insert(int location, int value) {
        try {
            if (arr[location] == 0) {
                arr[location] = value;
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
        try{
            for (int i =0 ; i< arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
        catch (Exception e){
            System.out.println("Array not exist");
        }
    }
    public void Search(int value){
        for (int i =0 ; i<arr.length; i++){
            if (arr[i]== value){
                System.out.println("Successfully Found");
            }
        }
    }
    public void delete(int location){
        arr[location] = 0;
        System.out.println("Delete Successfully");
    }
    public int[] twosum(int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }
    public void MissingNumber(){
        int Sum1 = 0;
        int Sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum1 += arr[i];
        }
        Sum2 = (arr[arr.length - 1] * (arr[arr.length - 1] + 1)) / 2;
        int d = Sum2 - Sum1;
        System.out.println(d);
    }
    public void unique(){
        boolean tr = true;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    tr = false;
                }
            }
        }
        if (tr) System.out.println("Unique Array");
        else System.out.println("Not Unique Array");
    }
    public void MaxProduct(){
        int max = 0;
        String pairs = "";

        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]*arr[j]>max){
                    max = arr[i]*arr[j];
                    pairs = arr[i] +","+arr[j];
                }
            }
        }
        System.out.println(pairs +" that is "+ max);
    }

}