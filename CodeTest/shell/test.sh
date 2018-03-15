#!/bin/bash
# 'test' instruction test
# file exists ?
if test -e /run/media/snail/workspace1/WrokSstation/gitRespo/CodeTest/shell/cleanBackup.sh
then
	echo 'file exists';
else 
	echo 'file doesn't exists;
fi

# file can be read

if test -r /run/media/snail/workspace1/WrokSstation/gitRespo/CodeTest/shell/cleanBackup.sh
then
	echo 'file can be read';
else 
	echo 'file can not be read';
fi