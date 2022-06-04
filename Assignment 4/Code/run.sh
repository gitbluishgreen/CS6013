 varn="main"
 if [ ! -d "~/Documents/CS6013/Assignment\ 4/${varn}_expected-output" ] 
 then
	mkdir ${varn}_expected-output
 else
	rm -r ${varn}_expected-output/*
 fi

javac P4.java
for file in ./${varn}_testcases/*.java
do
	var1=$(echo "$file" | cut --fields=3 --delimiter='/')
	java P4 <$file >./${varn}_expected-output/$var1
done
cd T2
javac Main.java
for file in ../${varn}_expected-output/*.java
do
	java Main <$file
done
cd ..
 cd ${varn}_testcases
 var=0
 for file in *.java
 do
	var2=$(echo "$file" | cut --fields=1 --delimiter='.')
   	var3="i${var}.txt"
 	javac $file
 	java $var2 >$var3
 	var=$((var + 1))
 done
 cd ../${varn}_expected-output
 var=0
 for file in *.java
 do
 	var2=$(echo "$file" | cut --fields=1 --delimiter='.')
 	var3="i${var}.txt"
 	javac $file
 	java $var2 >$var3
 	var=$((var + 1))
 done
 cd ..
 var=0
 var3=0
 for file in ./${varn}_expected-output/*.txt
 do
 	var1=$(echo "$file" | cut --fields=3 --delimiter='/')
 	cmp -s $file ./${varn}_testcases/$var1 && echo "Test Case ${var1} passed!" || echo "Test Case ${var1} failed!"
 	var=$((var + 1))
 done
cd ${varn}_testcases
rm *.class
rm *.txt
cd ../${varn}_expected-output
rm *.class
rm *.txt
cd ..
rm *.class
