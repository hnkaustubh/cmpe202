package org.launchcode;

public class GumballMachine3 extends GumballMachineMain{
    private int num_gumballs;
    private boolean has_nickel;
    private int size_nickel = 0;
    private boolean has_dime;
    private int size_dime = 0;
    private int size_quarter = 0;

    public GumballMachine3( int size ) {
        this.num_gumballs = size;
    }

    public void insertCoins( int coin ) {
        if(coin == 25) {
            has_quarter1 = true;
            size_quarter++;
            num_gumballs++;
        }
        else if(coin == 10) {
            has_dime = true;
            size_dime++;
            num_gumballs++;
        }
        else if(coin == 5) {
            has_nickel = true;
            size_nickel++;
            num_gumballs++;
        }
    }

    public void turnCrank() {
        if((size_nickel * 5) + (size_dime * 10) + (size_quarter * 25) == 50) {
            if(num_gumballs > 2) {
                for (int i=0; i<size_nickel; i++)
                    num_gumballs--;

                for (int j=0; j<size_dime; j++)
                    num_gumballs--;

                for (int k=0; k<size_quarter; k++)
                    num_gumballs--;

                System.out.println("Thanks for your coins. All inserted gumballs ejected");
            }
            else
                System.out.println("No more Gumballs! Sorry, can't return your coins");
        }
        else
            System.out.println("Sorry. Your total doesn't amount to 50 cents");
    }
}
