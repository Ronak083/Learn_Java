package Data_Structures.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SDA array = new SDA(5);
        Scanner sc = new Scanner(System.in);
        array.Insert(0,1);
        array.Insert(1,2);
        array.Insert(2,3);
        array.Insert(3,4);
        array.Insert(4,5);

        //array.Traverse();
        //array.Search(4);
        //array.MissingNumber();
        //array.twosum(9);
        //array.delete(4);
        array.unique();
        array.MaxProduct();


        //TwoDA Newarray = new TwoDA(3,3);
        //for(int i =0; i<Newarray.arr.length;i++){
        //    for(int j =0; j<Newarray.arr[0].length;j++){
        //        Newarray.insert(i,j, sc.nextInt());
        //    }
        //}
        //Newarray.Traverse();
        //Newarray.RotateMatrix();
        //Newarray.Traverse();


    }
}
