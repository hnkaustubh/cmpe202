package org.launchcode;

public class GumballMachine1 extends GumballMachineMain {
    private int num_gumballs;

    public GumballMachine1( int size )
    {
        // initialise instance variable
        this.num_gumballs = size;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            has_quarter1 = true ;
        else
            has_quarter1 = false ;
    }

    public void turnCrank()
    {
        if ( has_quarter1 )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                has_quarter1 = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert a quarter" ) ;
        }
    }
}
