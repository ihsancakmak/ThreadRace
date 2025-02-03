
import java.util.ArrayList;

public class MyThread {

    ArrayList<Integer> mainList = new ArrayList();

    ArrayList<Integer> firstQuarter = new ArrayList<>();
    ArrayList<Integer> secondQuarter = new ArrayList<>();
    ArrayList<Integer> thirdQuarter = new ArrayList<>();
    ArrayList<Integer> fourthQuarter = new ArrayList<>();

    ArrayList<Integer> oddList = new ArrayList<>();
    ArrayList<Integer> evenList = new ArrayList<>();

    MyThread(){

    }
    int j = 0;
    int k = 0;
    int l = 0;
    void fillTheList(){

        for(int i=0; i<10000; i++){
            mainList.add(i, i+1);
            if(i < 2500){
                firstQuarter.add(i, i+1);
            }
            if(i >= 2500 && i < 5000){
                secondQuarter.add(j, i+1);
                j++;
            }
            if(i >= 5000 && i < 7500){
                thirdQuarter.add(k, i+1);
                k++;
            }
            if(i >= 7500 && i < 10000){
                fourthQuarter.add(l, i+1);
                l++;
            }
        }
    }

    public ArrayList<Integer> getMainList() {
        return mainList;
    }

    public ArrayList<Integer> getFirstQuarter() {
        return firstQuarter;
    }

    public ArrayList<Integer> getSecondQuarter() {
        return secondQuarter;
    }

    public ArrayList<Integer> getThirdQuarter() {
        return thirdQuarter;
    }

    public ArrayList<Integer> getFourthQuarter() {
        return fourthQuarter;
    }

    public ArrayList<Integer> getOddList() {
        return oddList;
    }

    public ArrayList<Integer> getEvenList() {
        return evenList;
    }
}
