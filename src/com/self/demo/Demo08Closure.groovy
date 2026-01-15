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

def running(Closure closure) {
    println("running start...")
    closure()

    println("running end...")
}

running({ println("running........") })
//running.call({ println("running........") })


def caculate(Closure closure) {
    def num1 = 10
    def num2 = 15
    println closure(num1, num2)

}

////闭包作为方法的最后一个参数，那么闭包可以写在方法外边
//caculate { k, v ->
//    println("$k + $v = ${k + v}")
//    k + v
//}
caculate() { k, v ->
    println("$k + $v = ${k + v}")
    k + v
}

def caculate1() {
    def num1 = 1
    def num2 = 2
    return { k, v ->
        println("$k + $v" + " + "+ num1 + " + "+ num2 + "= ${k + v + num1 + num2}")
        k + v + num1 + num2
    }
}

def result = caculate1()
println result(3, 4)

//		{ item++ }
//		//闭包使用 空参数列表 明确规定这是无参的
//		{ -> item++ }
//		//闭包中有一个默认的参数[it]，写不写无所谓
//		{ println it }
//		{ it -> println it }
//		//如果不想使用默认的闭包参数it,那需要显示自定义参数的名称
//		{ name -> println name }
//		//闭包也可以接受多个参数
//		{ String x, int y ->
//		    println "hey ${x} the value is ${y}"
//		}
//		//闭包参数也可是一个对象
//		{ reader ->
//		    def line = reader.readLine()
//		    line.trim()
//}

def test(Closure closure) {
    def num2 = 150
    def closure1 = closure(num2)
    println(closure1)
    assert closure1 == 250
}

test { it += 100 }
//println test {it+=100 }


def closureWithNoArgs = { println 'hello' }
def closureWithOneArg = { str -> str.toUpperCase() }
assert closureWithOneArg('groovy') == 'GROOVY'

def closureWithOneArgAndExplicitType = { String str -> str.toUpperCase() }
assert closureWithOneArgAndExplicitType('groovy') == 'GROOVY'
println closureWithOneArgAndExplicitType('groovy')

def closureWithTwoArgs = { a, b -> a + b }
assert closureWithTwoArgs(1, 2) == 3

def closureWithTwoArgsAndExplicitTypes = { int a, int b -> a + b }
assert closureWithTwoArgsAndExplicitTypes(1, 2) == 3

def closureWithTwoArgsAndOptionalTypes = { a, int b -> a + b }
assert closureWithTwoArgsAndOptionalTypes(1, 2) == 3

def closureWithTwoArgAndDefaultValue = { int a, int b = 2 -> a + b }
assert closureWithTwoArgAndDefaultValue(1) == 3

