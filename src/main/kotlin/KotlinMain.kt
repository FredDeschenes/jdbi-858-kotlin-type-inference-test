fun main(args: Array<String>) {
    val javaThing = TheJavaThing()

    // Why do we need to explicitly declare the generic types here but not in Java?
//    Error:(5, 15) Kotlin: Type inference failed: Not enough information to infer parameter X in fun <E : Any!, X : Exception!> useTheThing(type: Class<E!>!, iface: ((theOtherThing: E!) -> Unit)!): Unit
//    Please specify it explicitly.
    javaThing.useTheThing<OtherThingImpl, Exception>(OtherThingImpl::class.java) { other ->

    }
}

class OtherThingImpl
