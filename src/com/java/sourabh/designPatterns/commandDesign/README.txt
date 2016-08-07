What is the Command Design Pattern?

The command pattern is behavioural design pattern in which an object is used to represent and encapsulate
all the information needed to call a method at a later time.

This information includes the method name, the object that owns the method and values for the method parameters.

<--------------Further Explanation-------------->

Allows you to store list of code that is executed at a later time or many times.

Client says I want a specific Command to run when execute() is called on 1 of these encapsulated object.

An object called the invoker transfers this command to another object called a Receiver to execute the right code.

TurnTVOn - DeviceButton - TurnTVOn - Television.TurnTVOn()

<---------------Advantages Of Command Design Pattern-------------------->

Allows you to set aside a list of commands for later use.

A class is a great place to store procedures you want to be executed.

You can store multiple commands in a class to use over and over.

You can implement undo procedures for past commands.

Negative: You create many small classes that stores list of commands.