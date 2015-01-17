#Template Method

	Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. 
	Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
	
##Principles:

- **The Hollywood Principle - Don't call us, we'll call you.**
	
	With the Hollywood Principle, we allow low-level components to hook themselves into a system, but the high-level components determine when they are needed, and how.
	In other words, the high-level components give the low-level components a "don't call us, we'll call you" treatment. 

##Related Patterns:

- **Strategy** 

	Encapsulate interchangeable behaviors and use delegation to decide which behavior to use.

- **Factory Method**  

	Subclasses decide which concrete classes to create.
	
##Examples:

- Arrays.sort(Object[])
	
	All elements must implements compareTo().
	
- InputStream.read(byte b[], int off, int len):

	The template method use read() that subclass implements.
	
- JFrame.update(Graphics g)

	The paint(g) is a hook method.
	
- Applet

	The hook methods: init(),start(),stop(),destroy().paint(Graphics).