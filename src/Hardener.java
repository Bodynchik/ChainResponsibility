// Абстрактний клас, котрий будуть розширювати відділи
abstract class Hardener {
    protected Hardener next;

    public void setNext(Hardener next) {
        this.next = next;
    }

    public void process(Statement statement) {
        if (canApprove(statement)) {
            System.out.println(getClass().getSimpleName() + " схвалив");
            if (next != null) {
                next.process(statement);
            } else {
                System.out.println("\nЗаява успішно пройшла всі етапи!");
            }
        } else {
            System.out.println(getClass().getSimpleName() + " відхилив заяву");
        }
    }

    protected abstract boolean canApprove(Statement application);
}
