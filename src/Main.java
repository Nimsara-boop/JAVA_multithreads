class A extends Thread{
    public void run(){
        for (int i =0;  i<10; i++){
            System.out.println("hi ");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Hello ");
        }
    }
}


public class Main{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());//priority range is 1-10. 1 is lowest, 10 is highest priority

        B obj3 = new B();
        obj3.setPriority(2); //this is how we set priorities
        obj3.setPriority(Thread.NORM_PRIORITY); //can set priorities like this too

        obj1.start();
        obj2.start();
    }
}