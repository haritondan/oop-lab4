# lab4-oop

![scheme](/images/Screenshot%20from%202022-10-10%2019-47-24.png)

For this laboratory work I did choose a restaurant as my system. I did choose this system because I did work in a restaurant as a waiter and I know the main componenents of how a restaurant should look from a system point of view.

We have here 11 classes(check the folder src):

1. We have our Object class that is the root of our classes. It's an abstract class and has a very basic output void function.

2. We have our 3 main of our main classes: Person, Section and List. These all are abstract classes, some of them implement interfaces and have some function overriden in their child classes.

3. We have our normal classes: - Client, Manager, Waiter --> Person; - Bar, European, Sushi --> Section; - Stock --> List
   These classes inherit all the functions, interfaces and methods from their parent classes. These child classes take care of instatiating our objects in our main program. Interfaces are implemented around to implement different scenarios based on our requirements.
   The stock class keeps track of our stock levels. It's a good practice to always keep the levels of stock in your restaurant between a range of 30-80.

Every class was implemented with the idea of using interfaces, polymorphism priciples and abstract classes as the main purpose. The system and every entity can be reworked into doing a better job, keeping track of multiple thing and implementing new rules will be very much appreciated. But that was not the purpose of our laboratory work, so I kept the system on a it's core scenarios.

![meme](/images/unknown.png)
