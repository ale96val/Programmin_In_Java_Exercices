public class BankAccount {
    private String PersonName; //Atribute 1.
    private String AccountNumber;  //Atribute 2.
    private double Taxes;  //Atribute 3.
    private double Money;  //Atribute 4.


    public BankAccount() { //Default constructor.
    }

    public BankAccount(String PersonName, String AccountNumber, double Taxes, double Money){  //Constructor with parameters.
        this.PersonName = PersonName;
        this.AccountNumber = AccountNumber;
        this.Taxes = Taxes;
        this.Money = Money;
    }

    public BankAccount(final BankAccount c){  //Constructor for copy an account.
        PersonName = c.PersonName;
        AccountNumber = c.AccountNumber;
        Taxes = c.Taxes;
        Money = c.Money;
    }

    //Getters & Setters.
    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getTaxes() {
        return Taxes;
    }

    public void setTaxes(double taxes) {
        Taxes = taxes;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    public void AddMoney(double n){  //Method for add money.
        Money = Money + n;
    }

    public boolean GetMoneyFromBank(double n){  //Method for get money.
        if ((Money - n)>= 0){
            Money = Money -n;
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) { //Main Class.
        //Information for new account.
        String name = "Oliver";
        String number = "BA1111222233334444";
        double tax = 1.2;
        double quantity = 2000;

        BankAccount BA1 = new BankAccount(); //Create a new BankAccount.
        BA1.setPersonName(name);  //Set the name.
        BA1.setAccountNumber(number);  //Set the account number.
        BA1.setTaxes(tax);  //Set the taxes.
        BA1.setMoney(quantity);  //Set the quantity of money.

        //Show inital information of the BankAccount created before.
        System.out.println("TEST: Information about the Bank Account BA1.");
        System.out.println("Personal Name: "+BA1.getPersonName());
        System.out.println("Account Number: "+BA1.getAccountNumber());
        System.out.println("Taxes: "+BA1.getTaxes());
        System.out.println("Money: "+BA1.getMoney());

        //Copy information to a second account.
        BankAccount BA2 = new BankAccount(BA1);

        //Getting money from BA2 (no valid quantity).
        System.out.println("TEST: Trying to get a no valid quantity of money from BA2.");
        if ((BA2.GetMoneyFromBank(4000)) == true){
            System.out.println("Now you have this money on your account: "+BA2.getMoney());
        }else{
            System.out.println("Invalid quantity of money");
        }

        //Getting money from BA2 (valid quantity).
        System.out.println("TEST: Trying to get a valid quantity of money from BA2.");
        if ((BA2.GetMoneyFromBank(1000)) == true){
            System.out.println("Now you have this momey on your account: "+BA2.getMoney());
        }else{
            System.out.println("Invalid quantity of money");
        }

        //Add money to BA1.
        System.out.println("TEST: Trying to add a quantity of money to BA1");
        BA1.AddMoney(4000);
        System.out.println("Now you have this money on your account: "+BA1.getMoney());

        //Testing if bank account BA1 and BA2 are independent.
        System.out.println("TEST: Differences between BA1 and BA2 after changes.");
        System.out.println("Money in BA1: "+BA1.getMoney());
        System.out.println("Money in BA2: "+BA2.getMoney());



    }
}
