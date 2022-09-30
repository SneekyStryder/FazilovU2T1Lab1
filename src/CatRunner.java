public class CatRunner {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Stryder", 3, 7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Dino", 9, 8.2);
        cat2.introduce();
        cat2.printCatInfo();

    }
}

