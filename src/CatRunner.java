package src;
public class CatRunner {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Oliver",10,5.4);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Billy",5,6.2);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
