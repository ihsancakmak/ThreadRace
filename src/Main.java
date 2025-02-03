import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyThread mainThread = new MyThread();
        mainThread.fillTheList();




        FirstQuarter firstQuarter = new FirstQuarter(mainThread);
        SecondQuarter secondQuarter = new SecondQuarter(mainThread);
        ThirdQuarter thirdQuarter = new ThirdQuarter(mainThread);
        FourthQuarter fourthQuarter = new FourthQuarter(mainThread);

        Thread t1 = new Thread(firstQuarter);
        Thread t2 = new Thread(secondQuarter);
        Thread t3 = new Thread(thirdQuarter);
        Thread t4 = new Thread(fourthQuarter);

        t1.start();
        t2.start();
        t3.start();
        t4.start();





    }
}
