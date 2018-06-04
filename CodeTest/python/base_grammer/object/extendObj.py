#!/usr/bin/python
# -*- coding: utf-8 -*-
from obj import Obj


# python中类的继承

#继承父类Obj，python的最终父类都是object，
class extendObj(Obj):
	#覆盖父类__init__方法
	def __init__(self,name,age,sex):
		super(extendObj,self).__init__(name,age)
		self.sex=sex
	def getSex(self):
		return self.sex

if __name__ == '__main__':
	#extendobj = extendObj('name1',21)
	#print(extendobj.getName())
	
	extendobj2 = extendObj('GG',22,'man')
	#调用父类中的方法
	print(extendobj2.getName())

	# 调用自定义的方法
	print(extendobj2.getSex())

	
	# 判断该类是否是某个类型
	print(isinstance(extendobj2,Obj))
