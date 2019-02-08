package org.launchcode;

public class Main {

    public static void main(String[] args) {
       GumballMachine3 gumball = new GumballMachine3(5);

       gumball.insertCoins(5);
        gumball.insertCoins(5);
        gumball.insertCoins(5);
        gumball.insertCoins(10);
        gumball.insertCoins(25);

        gumball.turnCrank();

        GumballMachine2 gumball2 = new GumballMachine2(5);
        gumball2.insertTwoQuarters(25,25);
        gumball2.turnCrank();
    }
}
