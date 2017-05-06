package com.karabeinikovAntonSikret87.app.classwork.lesson14.polimorphism;

/**
 * Created by AntonKa on 4/28/2017.
 */
public class ComputerRunner {
    public static void main(String[] args) {
//        IBM ibm = new IBM();
//        ibm.changeRAM();
        Computer aserCOmputer = new ASER();  //Computer interface , new ASER()constructor который создаёт
        Computer macComputer = new MAC();
        Computer ibmComputer = new IBM();
       // ibmComputer.changeRAM();
        Computer hpComputer =  new HP();
      //  hpComputer.changeRAM();
        Computer delComputer = new DEL();


//        changesForComputers(ibmComputer);
//        changesForComputers(new IBM());
//        changesForComputers(aserCOmputer);
//        changesForComputers(hpComputer);
//        changesForComputers(macComputer);


        Computer[] computers = new Computer[5];
        computers[0] = ibmComputer;
        computers[1] = hpComputer;
        computers[2] = aserCOmputer;
        computers[3] = macComputer;
        computers[4] = delComputer;

        changesForComputersArray(computers);
    }

    public static void changesForComputers(Computer computer){
        computer.changeRAM();
        computer.changeSSD();
        computer.changeCPU();

    }
    public static void changesForComputersArray(Computer[] computers){
       for(Computer comp: computers){
         changesForComputers(comp);
       }
    }
}
