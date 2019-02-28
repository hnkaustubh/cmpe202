1. CRC Cards - 

	a. Customer
		Responsibilities: 
			(i): Register name, cell phone number and number of people via cell phone
			(ii): Check for text messages
			(iii): Either check in or leave

		Corresponding Collaborators:
			(i): Restaurant Management, cell phone
			(ii): Restaurant Management, cell phone
			(iii): Restaurant Management, cell phone

	b. Restaurant Management
		Responsibilities:
			(i): Check if the customer at the front of the queue has a size less than or equal to table size available
			(ii): Send message to the next customer that fits
			(iii): Assign table if customer confirms
			(iv): Send message to next customer in queue if customer leaves
		
		Corresponding Collaborators:
			(i): Customer
			(ii): Customer, cell phone
			(iii): Customer
			(iv): Customer, cell phone

	c. Table 
		Responsbility:
			Represent the thing that the restaurant assigns to customers

	d. Din Tai Fung 
		Responsibilities:
			(i): Communicate with customers
			(ii): Assign table if there’s a proper fit

		Corresponding Collaborators:
			(i): Customer
			(ii): Restaurant Management		

	e. Cell Phone
		Responsbility:
			Facilitate Customer Resgistration
		Collbaorators:
			Customer, Restaurant Management

2. I chose to use the Chain of Responsibility Design pattern to design the collaborating objects for this problem. The reason for doing so is that - 

	a. The management of the restaurant is unaware of the right customer that is going to be accomadated in the table available next. In other words, the sender doesn't know the right object that will be responsible for handling the request. Therefore the management will need to send messages in a line till a request is accomadated. For example if a table for 4 people is available and the first customer in queue has a requirement for a table of 6, then he/she has to be put on hold and message has to be sent to the next customer in line and so on.

	b. There is more than one customer who may handle the request.

	c. The management doesn't want to send messages to all the available customers simulataneously, but wants to send to one of them, but doesn't who that is explicitly.

	d. There may be no customer that will fit a proper table at the moment. 
    
    Objects in relation to Chain of Responsibility Design Pattern: 
    
    a. Customer1: Client(initiates request to Concrete Handler)
    b. Din Tai Fung: Interface Handler(defines an interface for handling requests)
    c. Restaurant Management: Interface Handler
    d. Customer2, Customer3 and so on: Concrete Handlers
    
    
    
    
    
    
