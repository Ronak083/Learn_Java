package Data_Structures.Recursion;
import com.sun.tools.javac.Main;

public class recursion {
    public static void main(String[] args) {
        recursion rs = new recursion();
        var rec = rs.factorial(5);
        System.out.println(rec);
    }

    public int factorial(int n ){
        if(n<1) return -1;
        if(n==0 || n==1) return 1;
     return n * factorial(n-1);
    }
}
