package hw.n2;

public class N2 {

    public static void main(String[] arg){
        Watch newWatchMechanical = new Watch(20, "mechanical");
        Watch newWatchElectronic = new Watch(10, "electronic");
        newWatchMechanical.checkCondition();
        newWatchMechanical.announceYears();
        newWatchElectronic.checkCondition();
        newWatchElectronic.announceYears();
    }
}
