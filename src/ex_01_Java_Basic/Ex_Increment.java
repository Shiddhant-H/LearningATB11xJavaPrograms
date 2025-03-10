package ex_01_Java_Basic;

public class Ex_Increment {
    public static void main(String[] args) {
        // i = 1 and j = 1
        int i = 1;
        int j = i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("-----------------");

        // i = 1 and j = 1 but after instruction line for j execute i get instantly incremented then print line executed hence i = 2.

        i = 1;
        System.out.println("i = " + i);
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("-----------------");

        // i = 1 and j = 2 because of ++ i get incremented then execution of j instruction execute.

        i = 1;
        j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("-----------------");

/*
        i = 1;
        j = ++i;
*/


        System.out.println("i = " + ++i);
        System.out.println("j = " + ++j);
        System.out.println("-----------------");




    }
}
