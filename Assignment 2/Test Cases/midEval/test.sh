#!/bin/bash


function buildParsers()
{
	if [ -d parsers ]
then
	return
fi
	tar xzf parsers.tgz
	cd parsers
	ant
	cd ..
}
if [ $# != 3 ]
then
	echo "Usage: $0 <rollno> <assignment> <file.tgz> "
	exit 1
fi

roll=$1
inp=$2
ass=$3

if [ ! -f $inp ]
then
	echo "$inp not found. Exiting. "
	exit 2
fi

tar xzf $inp


if [ ! -d $roll/$ass/testcases ] || [ ! -d $roll/$ass/expected-output ]
then
	echo "$roll/$ass directory should contain $roll/$ass/testcases and $roll/$ass/expected-output directories."
	exit 3
fi

buildParsers

cd $roll/$ass/testcases
for x in *java
do
	cd ../testcases
	printf "%s " $x 
	java -cp ../../parsers/build/buritojava Main < $x  | grep -q "Successfully"
	if [ $? != 0 ]
	then
		echo "(input) not in right format"
		continue;
	fi
	javac $x
	if [ $? != 0 ]
	then
		echo "(input) does not compile"
		continue;
	fi
	java $(basename $x .java) 2>&1> $x.out
	if [ $? != 0 ]
	then
		echo "(input) does not run"
		continue;
	fi
	cd ../expected-output
	java -cp ../../parsers/build/tacojava Main < $x  | grep -q "Successfully"
	if [ $? != 0 ]
	then
		echo "(output) not in right format"
		continue;
	fi
	javac $x
	if [ $? != 0 ]
	then
		echo "(output) does not compile"
		continue;
	fi
	java $(basename $x .java) 2>&1> $x.out
	if [ $? != 0 ]
	then
		echo "(output) does not run"
		continue;
	fi
	diff -q $x.out ../testcases/$x.out
	if [ $? == 0 ]
	then
		echo "passed"
	else
		echo "o/p does not match"
	fi
done
