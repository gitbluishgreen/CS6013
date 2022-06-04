#!/bin/bash

#Uncomment this the first time you run it:-

#wget -r -nH --cut-dirs=2 --no-parent --reject="index.html*" https://www.cse.iitm.ac.in/~krishna/cs6013/buritojava/
javac P3.java
for file in ./testcases/*.java 
do
	echo "-----------------"
	var1=$(echo "$file" | cut --delimiter='/' --fields=3)
	var2=$(echo "$var1" | cut --delimiter='.' --fields=1)
	java P3 <$file >$var1	
	mv $var1 expected-output/
	echo "IR Generated for $file"
done
cd tacojava2
javac Main.java
for file in ../expected-output/*.java
do
	echo "-------------"
	echo "Output file: $file"
	java Main <$file
	var1=$(echo "$file" | cut --delimiter='/' --fields=3)
        var2=$(echo "$var1" | cut --delimiter='.' --fields=1)
	cat $file >$var1
	javac $var1
	java $var2
	rm -rf $var1	
done
rm -rf *.class
cd ..
rm -rf *.class
