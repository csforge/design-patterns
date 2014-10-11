#Design Patterns

Christopher Alexander says, "*Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution a million times over, without ever doing it the same way twice*".

The design patterns  are descriptions of communicating objects and classes that are customized to solve
a general design problem in a particular context.

*A Pattern is a solution to a problem in a context.*

##OO Fundamentals:##

- Abstraction
- Encapsulation
- Polymorphism
- Inheritance

##OO Principles:##

- Encapsulate what varies.
- Program to an interface, not an implementation.
- Favor object composition over class inheritance.
- Strive for loosely coupled designs between objects that interact.
- Classes should be open for extension, but closed for modification.
- Depend upon abstractions. Do not depend upon concrete classes.

##OO Patterns:##

- **Strategy**

	Define a family of algorithms, encapsulate each one, and makes them interchangeable. 
	Strategy lets the algorithm vary independently from clients that use it.

- **Observer**

	Define a one-to-many dependency between objects so that when one object changes state,
	 all its dependents are notified and updated automatically. 

- **Decorator**

	Attach additional responsibilities to an object dynamically. 
	Decorators provide a flexible alternative to subclassing for extending functionality. 

- **Factory Method**
	
	Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

- **Abstract Factory**
	
	Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
	
- **Singleton**

	Ensure a class only has one instance, and provides a global point of access to it.

- **Command**

	Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.	
	
	
###SOLID Design Principles:###

- The Single Responsibility Principle (SRP)

	Every software module should have only one reason to change.
	
- The Open-Close Principle (OCP)

	Software modules should be closed for modifications but open for extensions.
	
- The Liskov Substitution Principle (LSP)

	Subclasses should be substitutable for base classes.
	
- The Interface Segregation Principle (ISP)

	Clients should not be forced to implement interfaces they don’t use.
	
- The Dependency Inversion Principle  (DIP)

	High level modules should not depend upon low level modules. Rather, both should depend upon abstractions.


###Rference:###

1. Head First Design Patterns, O'Reilly 
2. Design Patterns: Elements of Reusable Object-Oriented Software, GoF 
3. Agile Software Development, Principles, Patterns, and Practices, Robert C. Martin 

###Books:###

- [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.uml.org.cn/c++/pdf/DesignPatterns.pdf)

- [Head First Design Patterns](http://it-ebooks.info/book/3213/)

###Articles:###

- [Object Oriented Design Principles](http://www.codeproject.com/Articles/567768/Object-Oriented-Design-Principles)
