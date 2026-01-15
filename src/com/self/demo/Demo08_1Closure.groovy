package com.self.demo

// 定义一个方法，用于过滤集合中的偶数
def filterEvenNumbers(list) {
    List<Integer> result = []
    list.each {
        if (it % 2 == 0) {
            result << it
        }
    }
    return result
}

// 定义一个闭包，用于过滤集合中的奇数
def filterOddNumbers = { list ->
    List<Integer> result = []
    list.each {
        if (it % 2 == 1) {
            result << it
        }
    }
    return result
}

// 创建一个列表，其中包含一些数字
def numbers = [1, 2, 3, 4, 5, 6]

// 使用方法来过滤偶数
def evenNumbers = filterEvenNumbers(numbers)
println "Even numbers: ${evenNumbers}" // 输出：Even numbers: [2, 4, 6]

// 使用闭包来过滤奇数
def oddNumbers = filterOddNumbers(numbers)
println "Odd numbers: ${oddNumbers}" // 输出：Odd numbers: [1, 3, 5]

// 将闭包作为参数传递给另一个方法
def filteredNumbers = numbers.findAll(filterOddNumbers)
println "Filtered numbers: ${filteredNumbers}" // 输出：Filtered numbers: [1, 3, 5]


def multiplyBy(factor) {
    return { number -> number * factor }
}

def double1 = multiplyBy(2)
println double1
def triple = multiplyBy(3)

println double1(5) // 输出：10
println triple(5) // 输出：15

int num = 10
int num1 = 1
int num2 = 2
int num3 = 3
def addBy(factor) {
    return { number1, number2 -> number1 + number2 + factor }
}
def addBy1 = { factor -> { number1, number2 -> number1 + number2 + factor } }

def add1 = addBy(num)
def add2 = addBy(num)
def add3 = addBy1(num)
println add1(num1,num2) // 输出：13
println add2(num1,num3) // 输出：14
println add3(num2,num2) // 输出：15