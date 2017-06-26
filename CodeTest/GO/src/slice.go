package main

import "fmt"

func main(){
		
	var sl []int
	fmt.Println(sl)

	sl1:=make([]int,3,10)
	fmt.Println(len(sl1),cap(sl1))

	a:=[]byte{'a','b','c','d','e','f','g'}
	sa:=a[2:5]
	fmt.Println(sa)
	fmt.Println(a)
}