package MAstering_DSA.Arrays;

public class Main {
    public static void main(String[] args) {
        SDA array = new SDA(10);
        array.Insert(2, 50);
        array.Insert(4, 540);
        array.Insert(2, 54);
        array.Insert(20, 554);
        array.Insert(7, 56);

        array.Traverse();
        array.Search(540);
    }
}
