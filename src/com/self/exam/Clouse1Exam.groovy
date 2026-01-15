//def processString(string, filter, action){
//    string.replaceAll(filter, action)
//    list.each { item ->
//        action(item)
//    }
//}
//将Hello World中的World替换成Groovy，并打印出来,filter将Hello World中的World替换成Groovy，action打印出来
def processString(string, filter, action){
   action(filter(string))

}

def myString = "Hello World"

def filter = { string ->
    string.replaceAll("World", "Groovy")
}

def action = { string ->
    println string
}

processString(myString, filter, action)