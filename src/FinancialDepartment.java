class FinancialDepartment extends Hardener {
    @Override
    protected boolean canApprove(Statement statement) {
        return statement.budgetConfirmed;
    }
}
