class Rector extends Hardener {
    @Override
    protected boolean canApprove(Statement statement) {
        return true; // Завжди буде вірним так як все залежить від начальника відділу кадрів
    }
}
