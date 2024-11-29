class Dean extends Hardener {
    @Override
    protected boolean canApprove(Statement statement) {
        return true; // Завжди буде вірним так як все залежить від завідувача кафедри
    }
}
