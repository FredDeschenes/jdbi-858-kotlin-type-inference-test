# Kotlin type inference weirdness

Based on [this Jdbi issue](https://github.com/jdbi/jdbi/issues/858).

If you check out [Java](src/main/java/JavaMain.java) and [Kotlin](src/main/kotlin/KotlinMain.kt) implementations of the same thing,
you'll see that the Java version does'nt need to explicitly declare the generic types when calling `TheJavaThing::useTheThing`, whereas the Kotlin version does.

Is this a bug in Kotlin's type inference stuff or is this expected?

On one side, it's true that the exception type isn't defined anywhere, so technically it shouldn't compile, but the Java compiler handles it like a champ.

Not the end of the world, it just feels wrong having to write more code in Kotlin than in Java tbh ;)
