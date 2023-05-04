package programmer.zaman.now.thread;

public class Counter {

    private Long value = 0L;

    public void increment(){
        value++;
    }

    public long getValue(){
        return value;
    }
}
