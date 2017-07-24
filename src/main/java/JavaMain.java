public class JavaMain {
    public static void main(String[] args) {
        final TheJavaThing javaThing = new TheJavaThing();

        // Why don't we need the generic types here but we do in Kotlin?
        javaThing.useTheThing(OtherThingImpl.class, theOtherThing -> {

        });
    }
}
