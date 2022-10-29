package MAstering_DSA.Arrays;

public class SDA {
    int[] arr = null;
    public SDA(int Size){
        arr = new int[Size];
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
}