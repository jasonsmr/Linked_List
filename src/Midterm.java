package Midterm_Practice;

public class Midterm {
    public static void doIt(Counter c1, Counter c2){
        c1.incr();
        c1 = new Counter(7);
        c2.incr();
        c1 = c2;
        c1.incr();
    }

    public static void main(String[] args){
        Counter c1 = new Counter(3);
        Counter c2 = new Counter(5);
        doIt(c1, c2);
        System.out.println("Line 1: " + c1 + " " + c2);
        doIt(c2, c1);
        System.out.println("Line 2: " + c1 + " " + c2);

        c1 = new Counter(7);
        c2 = new Counter(8);
        doIt(c1,c1);
        System.out.println("Line 3: " + c1 + " " + c2);
        doIt(c2,c2);
        System.out.println("Line 4: " + c1 + " " + c2);
    }
}
