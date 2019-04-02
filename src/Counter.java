package Midterm_Practice;

public class Counter {
    private int amt;

    public Counter(int number){
        amt = number;
    }

    public String toString(){
        return amt + "";
    }

    public void incr(){
        amt++;
    }
}
