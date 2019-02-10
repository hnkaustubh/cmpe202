
/**
 * Write a description of class SufficientMoneyState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SufficientMoneyState implements State
{
    GumballMachine gumballMachine;

    public SufficientMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int value) {
        System.out.println("You have already inserted enough money!");
    }

    public void ejectCoin() {
        System.out.println(gumballMachine.getMoneyInserted()+" cents returned");
        gumballMachine.updateMoneyInserted(0);
        gumballMachine.setState(gumballMachine.getInsufficientMoneyState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
