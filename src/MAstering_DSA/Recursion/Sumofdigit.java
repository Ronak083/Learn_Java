package LearnRecursion;

public class Sumofdigit {
    public static void main(String[] args) {
        Sumofdigit recur = new Sumofdigit();
        var result = recur.SOD(19);
        System.out.println(result);
    }

    public int SOD(int n){
        if(n==0 || n==1) return n ;
     return n%10 + SOD(n/10);
    }
}

