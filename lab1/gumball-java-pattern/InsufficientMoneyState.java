
/**
 * Write a description of class InsufficientMoneyState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsufficientMoneyState implements State
{
    GumballMachine gumballMachine;

    public InsufficientMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int value) {
        System.out.println("Inserting coin");
        if(gumballMachine.checkCoinValidity(value))
        {
            System.out.println("You inserted "+value+" cents");
            //this.moneyInserted += value;
            gumballMachine.updateMoneyInserted(value);

            if( gumballMachine.getMoneyInserted() >= gumballMachine.getGumballCost() )
                gumballMachine.setState(gumballMachine.getSufficientMoneyState());
        }
        else
            System.out.println("Coin of value "+value+" is invalid for this machine. Ejecting..");
    }

    public void ejectCoin() {
        if(gumballMachine.getMoneyInserted() > 0)
        {
            System.out.println("Ejecting "+gumballMachine.getMoneyInserted()+" cents");
            gumballMachine.setMoneyInserted(0);
        }
        else
            System.out.println("You can't eject, you haven't inserted any coins yet");

    }

    public void turnCrank() {
        System.out.println("Please insert "+( gumballMachine.getGumballCost() - gumballMachine.getMoneyInserted() )+" cents more.");
    }

    public void dispense() {
        System.out.println("You need to pay the full amount");
    }

    public String toString() {
        return "waiting for the full amount";
    }
}
