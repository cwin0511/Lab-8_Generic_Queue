import java.util.LinkedList;

class MyQueue<T> extends LinkedList<T> {

    public MyQueue() {
        super();
    }

    // 將元素加入佇列尾端
    public void enqueue(T item) {
        super.addLast(item);
    }

    // 從佇列頭部取出元素，若為空則回傳 null
    public T dequeue() {
        if (super.isEmpty()) return null;
        return super.removeFirst();
    }
    
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 返回队列中的元素数量
    @Override
    public int size() {
        return super.size();
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        //do some test if needed
    }
}


//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------