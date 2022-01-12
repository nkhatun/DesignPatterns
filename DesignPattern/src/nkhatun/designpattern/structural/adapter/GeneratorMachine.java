package nkhatun.designpattern.structural.adapter;

public class GeneratorMachine {
    public Card getTouchPoints(){
        return new Card(100);
    }
}
