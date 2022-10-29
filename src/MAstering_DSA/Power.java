package MAstering_DSA;

public class Power {
    public static void main(String[] args) {
        Power recursion = new Power();
        var result = recursion.pw(5,0);
        System.out.println(result);
    }
    public int pw(int base, int expo){
        if(expo==0) return 1;
        return base*pw(base , expo-1);
    }
}
