// Manual tests for the HomeCat class
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new HomeCat(5, "Vasya");
        cat1.View();
        Cat cat2 = new HomeCat();
        cat2.View();
        Cat cat3 = new HomeCat(-4,"Angel");
        cat3.View();
    }
}