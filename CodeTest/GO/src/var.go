package main

const k string ="test"
var x,y int
var (//这种因式分解关键字的写法一般用于声明全局变量
	a int
	b bool
)

var c,d int = 1,2
var e,f = 123,"hello world!"

func main(){

		g,h := 123,"helle world!"
		println(x,y,a,b,c,d,e,f,g,h)
		println(&x,&g)
		j := g;
		println(j,&j)
		println(k)
		
	}

