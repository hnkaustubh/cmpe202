1. CRC Cards - 

	a. Customer

		Responsibilities: 
			(i): Register name, cell phone number and number of people via cell phone
			(ii): Check for text messages
			(iii): Either check in or leave

		Collaborators:
			(i): Restaurant Management
			(ii): Restaurant Management
			(iii): Restaurant Management

	b. Din Tai Fung

		Responsbilities: 
			(i): Maintain customers' queue with details(name, phone number etc.)
			(ii): Inform Manager 

		Collaborators:
			(i): Customer
			(ii): Manager

	c. Manager

		Responsibilities:
			(i): Add customers to the waiting list
			(ii): Remove certain clients from waiting list
			(iii): Provide size of next table available
			(iv): Check if next available table is less than or equal to next customer's size 
		
		Corresponding Collaborators:
			(i): Customer, LocateAndAssign
			(ii): Customer
			(iii): Table
			(iv): Table, Customer

	c. Table 

		Responsbility:
			Represent the thing that the restaurant assigns to customers

	e. AllocateCurrent 

		Responsibilities:
			(i): Allocate table to customer at the front of waitlist
			(ii): Call next handler in the waitlist

		Corresponding Collaborators:
			(i): Customer, Manager
			(ii): Manager

	f. LocateAndAssign

		Responsbility:
			(i): Locate table for client
			(ii): Allocate table to client
		Collbaorators:
			(i): Manager, Client
			(ii): Client, table

2. I chose to use the Chain of Responsibility Design pattern to design the collaborating objects for this problem. The reason for doing so is that - 

	a. The management of the restaurant is unaware of the right customer that is going to be accomadated in the table available next. In other words, the sender doesn't know the right object that will be responsible for handling the request. Therefore the management will need to send messages in a line till a request is accomadated. For example if a table for 4 people is available and the first customer in queue has a requirement for a table of 6, then he/she has to be put on hold and message has to be sent to the next customer in line and so on.

	b. There is more than one customer who may handle the request.

	c. The management doesn't want to send messages to all the available customers simulataneously, but wants to send to one of them, but doesn't who that is explicitly.

	d. There may be no customer that will fit a proper table at the moment. 
    
    Objects in relation to Chain of Responsibility Design Pattern: 
    
    a. Customer: Client(initiates request to Concrete Handler, the customer can be anywhere in the queue from the front to the tail)

    b. Table Handler: Interface Handler(defines an interface for handling requests)

    c. AllocateCurrent: Concrete Handler 1
    
    d. LocateAndAssign: Concrete Handler 2
    
    
    
    
    
    
