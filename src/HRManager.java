class HRManager extends Hardener {
    @Override
    protected boolean canApprove(Statement statement) {
        return statement.documentsValid;
    }
}
