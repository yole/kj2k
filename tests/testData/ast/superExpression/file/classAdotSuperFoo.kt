open class Base() {
open fun foo() : Unit
}
open class A() : Base() {
open class C() {
open fun test() : Unit {
super@A.foo()
}
}
}