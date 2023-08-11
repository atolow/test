package fc.java.testmodel;

import fc.java.testmodel.ComputerCase;
import fc.java.testmodel.Monitor;
import fc.java.testmodel.Motherboard;
import fc.java.testmodel.PersonalComputer;


public class Computer {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("Bj-200","Asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixerlAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}
