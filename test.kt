//```Kotlin
fun main() {
    val foo = Foo(Foo.Bar.BAR3, Foo.Baz.BAZ1)
    println(foo)

    val faa = Foo(Foo.Bar.BAR2, Foo.Baz.BAZ1)
    println(faa)

    val fii = Foo(Foo.Bar.BAR3, Foo.Baz.BAZ1)
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
//```
