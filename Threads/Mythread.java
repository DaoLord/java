class Mythread extends Thread {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("User Thread Value:"+ i);
        }
    }
    
}
public class ThreadExample{
    public static void main(String[]args){
        Mythread mt= new Mythread();
        Thread t = new Thread (mt);
        t.start();
    }
}
