package main

import "fmt"

func main(){
	a:=[2]int{1}
	fmt.Println(a)
	b:=[...]int{19:23}
	fmt.Println(b)
	
	c :=[2]string{"aa","nn"}
	fmt.Println(c)  
	p :=new ([20]int)
	fmt.Println(p)
	p[2]=200
	fmt.Println(p)
	
	d :=[2][3]int{
		{1,1,1},
		{2,2,2}}//这个}必须写在这里
	
	fmt.Println(d)

	
	e :=[...]int{3,5,9,1,80}
	len :=len(e)
	for i:=0;i<len;i++{
		for j:=i+1;j<len;j++{
			if e[i]	<e[j]{
				temp:=e[i]
				e[i]=e[j]
				e[j]=temp
			}
		}
	}

	fmt.Println(e)
	
}
