package Proverochnye.rekursiya;

public class RecursiveString {/*
    public static void main(String[] args) {
    String s = "MyJava";
    System.out.println(recursiveMethod(s));
}

    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            //System.out.println(str);
            return str;
        }
        System.out.println(recursiveMethod(str.substring(1)) + str.charAt(0));
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }*/
    public static int recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return 1;
        }
        n = 2;
        // Шаг рекурсии / рекурсивное условие
        //System.out.println(n);
        return recursion(n - 1) * n;
    }
    public static void main(String[] args) {
        System.out.println(recursion(5)); // вызов рекурсивной функции
    }
}
