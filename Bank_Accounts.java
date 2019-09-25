package com.toptal.jogger.service;
import java.text.MessageFormat;
import java.util.*;



interface BankAccount{
    AccountType getAccountType();
    int getUnits();
    String getCurrency();
}

class AccountType{
    private String accountType;

    public AccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getName(){
        return accountType;
    }
}

class SavingsAccount implements BankAccount{

    String usd;
    int i;
    public SavingsAccount(String usd, int i) {
        this.usd = usd;
        this.i = i;
    }

    @Override
    public AccountType getAccountType() {
        return new AccountType("Savings");
    }

    @Override
    public int getUnits() {
        return i;
    }

    @Override
    public String getCurrency() {
        return usd;
    }
}

class CheckingAccount implements BankAccount{

    String usd;
    int i;
    public CheckingAccount(String usd, int i) {
        this.usd = usd;
        this.i = i;
    }

    @Override
    public AccountType getAccountType() {
        return new AccountType("Checking");
    }

    @Override
    public int getUnits() {
        return i;
    }

    @Override
    public String getCurrency() {
        return usd;
    }
}


class BrokerageAccount implements BankAccount{

    String usd;
    int i;
    public BrokerageAccount(String usd, int i) {
        this.usd = usd;
        this.i = i;
    }

    @Override
    public AccountType getAccountType() {
        return new AccountType("Brokerage");
    }

    @Override
    public int getUnits() {
        return i;
    }

    @Override
    public String getCurrency() {
        return usd;
    }
}

public class Bank_Accounts {

    private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";


    public static void main(String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD",3));//Savings
        accounts.add(new SavingsAccount("EUR",2));//Savings
        accounts.add(new CheckingAccount("HUF",100));//Checking
        accounts.add(new CheckingAccount("COP",10000));//Checking
        accounts.add(new BrokerageAccount("GBP",2));//Brokerage
        accounts.add(new BrokerageAccount("INR",600));//Brokerage

        accounts.stream().forEach(
                account -> System.out.println(
                        MessageFormat.format(TEXT,
                                new Object[]{
                                        account.getAccountType().getName(),//make this work
                                        account.getUnits(),//make this work
                                        account.getCurrency()//make this work
                                })));
    }
}