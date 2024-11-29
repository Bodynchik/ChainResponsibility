// Клас заяви
class Statement {
    public boolean vacancyAvailable;
    public boolean documentsValid;
    public boolean budgetConfirmed;


    public Statement(boolean vacancyAvailable, boolean documentsValid, boolean budgetConfirmed) {
        this.vacancyAvailable = vacancyAvailable;
        this.documentsValid = documentsValid;
        this.budgetConfirmed = budgetConfirmed;
    }
}
