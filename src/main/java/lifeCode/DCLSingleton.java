package lifeCode;

public final class DCLSingleton {

    private static DCLSingleton inst = new DCLSingleton();

    private DCLSingleton() {
    }

    public synchronized static DCLSingleton instOf() {
        return inst;
    }
}
