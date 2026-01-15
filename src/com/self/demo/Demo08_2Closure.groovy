package com.self.demo;

/*====================================================
      闭包：
        定义：是一个开放的、匿名的代码块，它可以接受参数、也可以有返回值。闭包可以引用其周围作用域中声明的变量。
        语法：{ [closureParameters -> ] statements }
        调用：
            第一步：将闭包赋值给一个变量
            第二步: 变量名()、变量名.call()

        闭包在实际开发中的使用：作为方法的参数使用
======================================================*/


def processList(list, action, filter) {
    list.findAll(filter).each { item ->
        action(item)
    }
}

def myList = [1, 2, 3, 4, 5]

def printIfOdd = { number ->
    if (number % 2 != 0) {
        println number
    }
}

def myMethod() {
    def closure1 = { println "Hello from closure 1" }
    def closure2 = { println "Hello from closure 2" }
    def closure3 = { println "Hello from closure 3" }

    closure1()
    closure2()
    closure3()
}

myMethod()


def square = { number ->
    println number * number
}

processList(myList, printIfOdd, { it > 2 })
println("-----------")
processList(myList, square, { it < 4 })
