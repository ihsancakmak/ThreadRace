public class ThirdQuarter implements Runnable{
    MyThread mainThread;
    public ThirdQuarter(MyThread mainThread) {
        this.mainThread = mainThread;
    }

    int k = 0;
    int l = 0;
    @Override
    public void run() {

        for(Integer i : mainThread.getThirdQuarter()){


            if(i % 2 == 0){
                mainThread.evenList.add(k, i);
                System.out.println(mainThread.evenList.get(k));
                k++;
            }
            else{
                mainThread.oddList.add(l, i);
                //System.out.println(mainThread.oddList.get(l));
                l++;

            }

        }
    }
}
