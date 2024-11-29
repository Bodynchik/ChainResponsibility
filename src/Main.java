// Для вирішення поставленої задачі використовувався шаблон Chain of Responsibility
public class Main {
    public static void main(String[] args) {
        // Створення заяви
        Statement statement = new Statement(true, true, true);

        // Налаштування ланцюга
        Hardener headDepartment = new HeadDepartment();
        Hardener dean = new Dean();
        Hardener hrManager = new HRManager();
        Hardener rector = new Rector();
        Hardener financialDepartment = new FinancialDepartment();

        headDepartment.setNext(dean);
        dean.setNext(hrManager);
        hrManager.setNext(rector);
        rector.setNext(financialDepartment);

        // Обробка заяви
        headDepartment.process(statement);
    }
}