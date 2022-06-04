#Uncomment this the first time you run it:-
#wget -r -nH --cut-dirs=2 --no-parent --reject="index.html*" https://www.cse.iitm.ac.in/~krishna/cs6013/buritojava/
javac P2.java
for file in ./buritojava/*.java 
do
	echo "-----------------"
	echo "IR generated for $file"
	var1=$(echo "$file" | cut --delimiter='/' --fields=3)
	var2=$(echo "$var1" | cut --delimiter='.' --fields=1)	
	java P2 <$file >tacojava/Outputs/$var1
done
cd tacojava
javac Main.java
var=0
for file in ./Outputs/*.java
do
	echo "-----------------"
	var1=$(echo "$file" | cut --delimiter='/' --fields=3)
    var2=$(echo "$var1" | cut --delimiter='.' --fields=1)
	echo "Checking Syntax and Semantics of $var1"
	java Main <$file
	cd Outputs
	javac $var1
	java $var2 >a.txt
	cd ../../buritojava
	javac $var1
	java $var2 >../tacojava/Outputs/b.txt
	cd ../tacojava/Outputs
	cmp -s a.txt b.txt && echo "Test Case $var1 passed!" || echo "Test Case $var1 failed!"
	cd ..
	
done
rm -rf *.class
cd ..
rm -rf *.class
cd visitor
rm *.class
cd ..
cd syntaxtree
rm *.class
cd ..
