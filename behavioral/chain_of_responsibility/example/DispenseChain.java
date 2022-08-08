package behavioral.chain_of_responsibility.example;

interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}

class Rupees50Dispensor implements DispenseChain{
    private  DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>=50){
            int num = currency.getAmount()/50;
            int rem = currency.getAmount()%50;
            System.out.println("Releasing "+num+" of Rs. 50 notes.");
            if (rem !=0)
                this.chain.dispense(new Currency(rem));
        }else {
            this.chain.dispense(currency);
        }
    }
}

class Rupees20Dispensor implements DispenseChain{
    private  DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>=20){
            int num = currency.getAmount()/20;
            int rem = currency.getAmount()%20;
            System.out.println("Releasing "+num+" of Rs. 20 notes.");
            if (rem !=0)
                this.chain.dispense(new Currency(rem));
        }else {
            this.chain.dispense(currency);
        }
    }
}
class Rupees10Dispensor implements DispenseChain{
    private  DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount()>=10){
            int num = currency.getAmount()/10;
            int rem = currency.getAmount()%10;
            System.out.println("Releasing "+num+" of Rs. 10 notes.");
            if (rem !=0)
                this.chain.dispense(new Currency(rem));
        }else {
            this.chain.dispense(currency);
        }
    }
}
