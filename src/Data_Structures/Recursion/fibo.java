package Data_Structures.Recursion;
public class fibo {
    public static void main(String[] args) {
        fibo recursion = new fibo();
        var rec = recursion.fibonacci(6);
        System.out.println(rec);
    }
    public int fibonacci(int n){
        if(n<0) return -1;
        if(n==0 || n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
