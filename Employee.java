public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices; 

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public Integer getTotalInvoiceAmount() {
        int total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return total;
    }

    @Override
    public Integer getPayableAmount() {
        return salaryPerMonth - getTotalInvoiceAmount();
    }

    public Integer getRegistrationNumber() { return registrationNumber; }
    public String getName() { return name; }
    public Integer getSalaryPerMonth() { return salaryPerMonth; }
}