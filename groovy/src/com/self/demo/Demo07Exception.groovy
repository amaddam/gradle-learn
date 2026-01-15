package com.self.demo

def z
try {
    def i = 7, j = 0
    try {
        def k = i / j
        println(k)
        assert false        //never reached due to Exception in previous line
    } finally {
        z = 'reached here'  //always executed even if Exception thrown
        println(z)
    }
} catch ( e ) {
    assert e in ArithmeticException
    assert z == 'reached here'
    println(e)
}