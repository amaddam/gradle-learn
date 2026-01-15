package com.self.demo





def obj = new Demo01BasicNotice(/*bookname: "斗破",description: "hello"*/);
//获取对象的属性
println(obj.getBookname())
println(obj["bookname"])
println(obj.bookname)

//设置对象的属性
obj.bookname="斗罗大陆1"
println(obj.bookname)
obj["bookname"]="斗罗大陆2"
println(obj.bookname)
obj.setBookname("斗罗大陆3")
println(obj.bookname)
obj=new Demo01BasicNotice(bookname: "斗罗大陆4")
println(obj.bookname)

//使用对象的方法
def result = obj.sale(100)
def result1 = obj.sale 100
println("============")
println(result)
println(result1)
