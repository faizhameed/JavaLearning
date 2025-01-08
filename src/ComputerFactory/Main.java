package ComputerFactory;
// composition is like creating objects within objects creating a master object
public class Main {
    public static  void main(String[] args){
        ComputerCase theCase =  new ComputerCase("2206","Samsung","240W");
        Monitor theMonitor = new Monitor("27 inch","Dell", 27,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Lenovo",theCase,theMonitor,theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        // load program
//        thePC.getMotherboard().loadProgram("Windows OS");
//        // press power button of the computer
//        thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
    }
}
