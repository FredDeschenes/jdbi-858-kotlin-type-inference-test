public class TheJavaThing {
    public <E, X extends Exception> void useTheThing(Class<E> type, TheJavaFunctionalInterface<E, X> iface)
            throws X {
        final E otherThing = getOtherThing();
        iface.doTheThing(otherThing);
    }

    private <E> E getOtherThing() {
        return null;
    }
}
