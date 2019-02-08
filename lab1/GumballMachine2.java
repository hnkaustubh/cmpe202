package org.launchcode;

public class GumballMachine2 extends GumballMachineMain{
    private int num_gumballs;

    public GumballMachine2( int size ) {
        this.num_gumballs = size;
    }

    public void insertTwoQuarters( int coin1, int coin2 ) {
        if(coin1 == 25)
            has_quarter1 = true;
        if(coin2 == 25)
            has_quarter2 = true;
    }

    public void turnCrank()
    {
        if ( has_quarter1 && has_quarter2 )
        {
            if ( this.num_gumballs > 1 )
            {
                this.num_gumballs-- ;
                this.num_gumballs-- ;
                has_quarter1 = false;
                has_quarter2 = false;
                System.out.println( "Thanks for your quarters. Two Gumballs Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else
        {
            System.out.println( "Sorry, you didn't insert 2 quarters, please insert 2 quarter" ) ;
        }
    }
}
