package hw.n2;

public class Watch {
    int years;
    String type;

    public Watch (int years, String type){
        this.years = years;
        this.type = type;
    }

    void checkCondition(){
        if (years > 15){
            System.out.println("Need service");
        } else {
            System.out.println("Service is not needed");
        }
    }

    void announceYears(){
        System.out.println("Watch is " + years + " years old!");
    }
}
