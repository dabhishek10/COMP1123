CLASS	= LeapYear
JDK		= javac
JRE		= java

all: make run

make: $(CLASS).java
	$(JDK) $(CLASS).java

run: $(CLASS).class
	$(JRE) $(CLASS)

clean:
	rm *.class
	rm *.java~
