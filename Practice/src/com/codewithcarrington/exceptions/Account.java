package com.codewithcarrington.exceptions;

import java.io.IOException;

public class Account {
    private float balance;
    public void deposit (float value) throws IOException {
        if (value <= 0)
            throw new IllegalArgumentException();
    }

    public void withdraw (float value) throws InsufficientFundsException {
        if(value > balance)
            throw new InsufficientFundsException();
    }

    public void withdraw2 (float value) throws AccountException {
        if(value > balance) {
            throw new AccountException(new InsufficientFundsException());

        }
    }

}
