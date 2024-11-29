class HeadDepartment extends Hardener {
    @Override
    protected boolean canApprove(Statement statement) {
        return statement.vacancyAvailable;
    }
}
