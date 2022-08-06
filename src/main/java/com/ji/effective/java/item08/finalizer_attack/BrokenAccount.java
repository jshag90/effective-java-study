package com.ji.effective.java.item08.finalizer_attack;

import java.math.BigDecimal;

public class BrokenAccount extends Account {

    public BrokenAccount(String accountId){super(accountId);}

    protected void finalize() throws Throwable{
        this.transfer(BigDecimal.valueOf(100), "keesun");
    }
}
