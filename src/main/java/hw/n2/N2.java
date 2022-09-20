package hw.n2;

public class N2 {

    public static void main(String[] arg){
        Watch newWatchMechanical = new Watch(20, "mechanical");
        Watch newWatchElectronic = new Watch(25, "electronic");
        Watch newWatchFashion = new Watch(16, "electronic");
        newWatchMechanical.checkCondition();
        newWatchMechanical.announceYears();
        newWatchElectronic.checkCondition();
        newWatchElectronic.announceYears();
        newWatchFashion.checkCondition();
        newWatchFashion.announceYears();
    }
}
