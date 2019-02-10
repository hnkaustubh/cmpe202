

public class Main {

    public static void main(String[] args) {
            System.out.println("********* Machine 1 Testing ***************");

            GumballMachine machine1 = new GumballMachine(1,1);
            machine1.insert_coin(25);
            machine1.insert_coin(25);
            machine1.insert_coin(10);
            machine1.turnCrank();
            System.out.println();
    
            System.out.println("********* Machine 2 Testing ***************");
    
            GumballMachine machine2 = new GumballMachine(2,2);
            machine2.insert_coin(25);
            machine2.insert_coin(25);
            machine2.insert_coin(25);
            machine2.turnCrank();
            System.out.println();
    
            System.out.println("********* Machine 3 Testing ***************");
            
            GumballMachine machine3 = new GumballMachine(6,3);
            machine3.insert_coin(5);
            machine3.insert_coin(10);
            machine3.insert_coin(10);
            machine3.insert_coin(25);
            machine3.insert_coin(15);
            machine3.turnCrank();
            System.out.println();
    }
}
