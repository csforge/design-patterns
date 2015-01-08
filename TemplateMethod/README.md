#Template Method

	Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. 
	Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
	
##Principles:

- **The Hollywood Principle - Don't call us, we'll call you.**

##Related Patterns:

- **Strategy**
- **Factory Method**  
	
##Examples:

- Arrays.sort(Object[])
	
	All elements must implements compareTo().
	
- InputStream.read(byte b[], int off, int len):

	The template method use read() that subclass implements.
	
- JFrame.update(Graphics g)

	The paint(g) is a hook method.
	
- Applet

	The hook methods: init(),start(),stop(),destroy().paint(Graphics).