
public class GumballMachine
{
    private int num_gumballs;
    private int machine_type;
    private int gumball_cost;
    private int amount_inserted;

    public GumballMachine(int size, int mac_type) {                    /* Size of Machine and Type of Machine gets passed in the Constructor */
        num_gumballs = size;

        switch (mac_type) {
            case 1: this.gumball_cost = 25;
                    this.machine_type = 1;
                    break;
            case 2: this.gumball_cost = 50;
                    this.machine_type = 2;
                    break;
            case 3: this.gumball_cost = 50;
                    this.machine_type = 3;
                    break;
                    default: System.out.println("Please enter a valid machine type(1,2 or 3)");
        }
    }

    public void insert_coin(int coin) {
        if(this.machine_type == 1 && coin == 25)                        /* Machine 1 accepts only 1 quarter */
            amount_inserted += coin;
        else if(this.machine_type == 2 && coin == 25)                   /* Machine 2 accepts only 2 quarters */
            amount_inserted += coin;
        else if(this.machine_type == 3 && ((coin == 5) || (coin == 10) || (coin == 25)))     /* Machine 3 accepts nickels, dimes and quarters */
            amount_inserted += coin;
        else
            System.out.println("Sorry, coin " + coin + " is invalid for this machine");
    }

    public void turnCrank() {
        int size = 0;
        if(this.num_gumballs > 0 && this.amount_inserted >= this.gumball_cost) {
            System.out.println("Success, " + amount_inserted + " cents inserted into machine " + machine_type);
            for(int i=0; i<(this.amount_inserted/this.gumball_cost); i++) {
                num_gumballs--;
                size++;
            }
            int amount_change = this.amount_inserted - (size*this.gumball_cost);
            System.out.println("Ejecting " + size + " gumball(s)");
            if(amount_change > 0) {
                System.out.println("Please collect your change: " + (this.amount_inserted-this.gumball_cost) + " cents");
            }
        }
        else if(this.num_gumballs <= 0)
            System.out.println("Sorry, no more gumballs left");
        else if(this.amount_inserted < this.gumball_cost)
            System.out.println("Sorry, insufficient amount, please insert " + (this.gumball_cost-this.amount_inserted) + " cents");
    }
}
