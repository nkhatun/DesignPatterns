# Singleton Design Patterns
###Introduction ::
The singleton design pattern is one of creational design patterns and its used to restrict the instantiation of a class to one object.
The single object is shared across the whole classes or throughout the application.
###Implementation Approach ::
To implement Singleton pattern, these below steps are to be followed
1. Static member: that contains the singleton object
2. Private constructor: that will prevent to create a new object from outside class
3. Static factory method: factory method to create a single instance of a class 

The below ways to create singleton design pattern:
1. Eager Loading : create object before its demand
2. Lazy Loading : create object on its demand
3. Synchronized method : using synchronized will ensure that in case of multithreaded environment we only one thread would enter to create object.
4. Double-checked locking : to acquire lock on the getInstance() once, when the obj is null. 
5. Using enum 








