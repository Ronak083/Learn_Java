package Data_Structures.Tree;

import The_java.DrinkTree.tree;

public  class Main {
    public static void main(String[] args) {
        tree drinks = new tree("Drinks");
        tree hot = new tree("Hot");
        tree cold = new tree("Cold");

        drinks.addChild(hot);
        drinks.addChild(cold);

        tree Tea = new tree("Tea");
        tree Coffee = new tree("Coffee");
        tree Beer = new tree("Beer");
        tree Wine = new tree("Wine");

        hot.addChild(Tea);
        hot.addChild(Coffee);

        cold.addChild(Beer);
        cold.addChild(Wine);
        System.out.println(drinks.print(0));








    }
}
