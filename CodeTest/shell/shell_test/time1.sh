#!/bin/bash
times=0
until [ "$times" = 3 ];
do 
  echo "I love linux.";
  sleep 2;
  times=`expr $times + 1`;
done
