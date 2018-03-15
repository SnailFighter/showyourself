#!/bin/bash
# custom function test

# function without params
judge(){
	if test -e /run/media/snail/workspace1/WrokSstation/gitRespo/CodeTest/shell/cleanBackup.sh
	then
		echo 'file exists'
	else 
		echo 'file doesn't exists
	fi

	# file can be read

	if test -r /run/media/snail/workspace1/WrokSstation/gitRespo/CodeTest/shell/cleanBackup.sh
	then
		echo 'file can be read'
	else 
		echo 'file can not be read'
	fi
}

# function with params,but the synax is wrong.the params can be wroten in '()',so if you want to pass params,you can do so like 
# judge1 $1 $2 .See below example

#judge1(param1,param2){
#	if(param1 -eq param2)
#	then 
#		echo 'two params are equal.'
#	else
#		echo 'two params are not equal.'
#	fi
#}

judge2(){
	if test $1 -eq $2
	then 
		echo 'two params are equal.'
	else
		echo 'two params are not equal.'
	fi
}



echo 'start to call judge()'
	judge
	# if you write this code 'judge()',the shell will be wrong and show you some wrong infomation 
	#judge1(1,3) this synax is wrong
	judge2 1 6
echo 'end to call judge()'