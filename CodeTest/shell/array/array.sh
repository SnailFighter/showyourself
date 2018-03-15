#!/bin/bash
# array test 


array=(a b c d e)
//notice: must use {}
for val in ${array[@]}
do
	echo "the value is $val"
done


for val in ${array[*]}
do
	echo "the value is $val"
done

# you can use @ or * to get the all values of array.