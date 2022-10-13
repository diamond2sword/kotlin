```Kotlin
fun main() {
    val foo = Foo(BAR3, BAZ1)
    println(foo)

    val faa = Foo(BAR2, BAZ1)
    println(faa)

    val fii = Foo(BAR3, BAZ1)
    println(fii)
}

data class Foo(bar : Bar, baz : Baz) : I<Foo> {
    
    enum class Bar : I<Bar> {
        BAR1,
        BAR2,
        BAR3
    }

    enum class Baz : I<Baz> {
        BAZ1,
        BAZ2,
        BAZ3
    }
}

class I<T : I<T>> {
    fun <F : T> F.isEqualTo(f : F) : Boolean {
        return this == f
    }

    fun <F : T> F.isIn(f : List<F>) : Boolean {
        return f in this
    }
}
```
