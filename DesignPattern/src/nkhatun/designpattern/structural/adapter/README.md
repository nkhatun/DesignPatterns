# Adapter Design Patterns
### Introduction ::
The adapter design pattern is one of structural design patterns and its used so that two unrelated interfaces to work together.
The object that joins these unrelated interfaces, is known as Adapter.

An adapter pattern is also known as Wrapper pattern. 
### Use cases ::
One can use the Adapter pattern for the below cases:
* You want to use an existing class, and its interface does not match the one you need
* You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* You need to use several existing subclasses, but it's impractical to adapt their interface by subclassing everyone. An object adapter can adapt the interface of its parent class.
* Most of the applications using third-party libraries use adapters as a middle layer between the application and the 3rd party library to decouple the application from the library. If another library has to be used only an adapter for the new library is required without having to change the application code.
### Use in java ::
JDK's collection framework offers many examples of the adapter pattern:
1. java.util.Arrays#asList()
3. java.util.Collections#list()
4. java.util.Collections#enumeration()
5. javax.xml.bind.annotation.adapters.XMLAdapter
6. java.io.OutputStreamWriter(OutputStream)
### Implementation Approach ::
While implementing Adapter pattern, there are two approaches and both produces same result
1. class adapter : This form uses Java Inheritance and extends the source interface.
2. object adapter : This form uses Java Composition and adapter contains the source object.

#### Consequences:
Class and object adapters have different trade-offs.

A class adapter 
* Adapts Adaptee to Target by committing to a concrete Adaptee class.
As a consequence, a class adapter won’t work when we want to adapt a class and all its subclasses.
* Let’s Adapter override some of Adaptee’s behavior since Adapter is a subclass of Adaptee
* Introduces only one object, and no additional pointer indirection is needed to get to the adaptee.

An object adapter 
* Lets a single Adapter work with many Adaptees—that is, the Adaptee itself and all of its subclasses (if any). The Adapter can also add functionality to all Adaptees at once.
* Makes it harder to override Adaptee behavior. It will require subclassing Adaptee and making the Adapter refer to the subclass rather than the Adaptee itself.








