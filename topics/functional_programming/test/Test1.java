package topics.functional_programming.test;

public class Test1 {

    public static void main(String[] args) {

        MyFunctionalInterface fi = n -> {
            return n * n;
        };
        System.out.println(fi.sqr(5));
    }
}
