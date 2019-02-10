

public class GumballMachine {
 State soldOutState;
    State insufficientMoneyState;
    State sufficientMoneyState;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int machineType = 0;
    int moneyInserted = 0;
    int gumballCost = 0;

    public GumballMachine(int numberGumballs, int machineType) {
        soldOutState = new SoldOutState(this);
        insufficientMoneyState = new InsufficientMoneyState(this);
        sufficientMoneyState = new SufficientMoneyState(this);
        soldState = new SoldState(this);
        this.moneyInserted = 0;
        this.count = numberGumballs;
        this.machineType = machineType;

        if (numberGumballs > 0) {
            state = insufficientMoneyState;
        }

        switch(machineType)
        {
            case 1 : gumballCost = 25; break;
            case 2 : gumballCost = 50; break;
            case 3 : gumballCost = 50; break;
            default : System.out.println("There is no such machine!");
        }
    }

    public int getMoneyInserted(){
        return this.moneyInserted;
    }

    public void setMoneyInserted(int value){
        this.moneyInserted = 0;
    }


    public void updateMoneyInserted(int value){
        this.moneyInserted+=value;
    }

    public int getGumballCost(){
        return this.gumballCost;
    }

    public void insertCoin(int value) {
        state.insertCoin(value);
    }

    public void ejectCoins() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
        int diff = this.getMoneyInserted() - this.getGumballCost();
        if(diff>0)
        {
            System.out.println("Ejecting change of "+diff+" cents");
            moneyInserted = 0;
        }
    }

    int getCount() {
        return count;
    }

    public boolean checkCoinValidity(int value)
    {
        System.out.println("Checking coin type");
        switch(this.machineType)
        {
            case 1 : return value == 25;
            case 2 : return value == 25;
            case 3 : return value == 5 || value == 10 || value == 25;
        }

        return false;
    }

    void refill(int count) {
        this.count = getCount() + count;
        state = insufficientMoneyState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getInsufficientMoneyState() {
        return insufficientMoneyState;
    }

    public State getSufficientMoneyState() {
        return sufficientMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
