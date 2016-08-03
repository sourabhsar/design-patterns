What is a Factory Pattern??

When a method returns one of several possible classes that share a common super class.

1) Create a new enemy game.
2) Random number generator picks a number assigned to a specific enemy.
3) The factory returns the enemy associated with that number.

The class is chosen at runtime.

When to use a factory pattern.

1) When you don't know ahead of time what class object you need.
2) When all the potential classes are in the same subclass hierarchy.
3) To centralize class selection code.
4) When you don't want the user to have to know every subclass.
5) To encapsulate object creation.


The factory pattern allows you to create objects without specifying the exact class of the object that will be created at runtime.

