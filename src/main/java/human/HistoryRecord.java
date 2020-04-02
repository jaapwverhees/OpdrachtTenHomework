package human;

import annotations.MyAnnotation;

import java.util.Arrays;

public class HistoryRecord {
    int counter;
    private String[] descriptions;
    private static final int MAX = 10;

    public HistoryRecord() {
        this.descriptions = new String[10];
        this.counter = 0;

    }
    @MyAnnotation("beeh")
    public boolean addDescription(String decription){
        if(counter == MAX){return false;}
        this.descriptions[counter] = decription;
        counter++;
        return true;
    }

    public String ToString(){
        return Arrays.toString(descriptions);
    }
}
