class Client {
    public static void main(String[] args) {
        Acc obj = new Acc();
        obj.withDraw(500);
        obj.deposit(600);
       double balMoney = obj.checkBal();
        System.out.println("Your current bank bal is: " + balMoney);
    }
}

class Acc {
    private double bal = 1000;

    public void withDraw(double drawmoney) {
        if(drawmoney<bal)
        System.out.println("insufficient bank account");
        bal = bal - drawmoney;
    }

    public void deposit(double depmoney) {
        bal = bal + depmoney;
    }

    public double checkBal() {

        return bal;
    }

}
