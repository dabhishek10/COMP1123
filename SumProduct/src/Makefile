CLASS	= SumProduct
JDK		= javac
JRE		= java

all: make run

make: $(CLASS).java
	$(JDK) $(CLASS).java

run: $(CLASS).class
	$(JRE) $(CLASS)

clean:
	rm *.class &1>/dev/null
	rm *.java~ &1>/dev/null
