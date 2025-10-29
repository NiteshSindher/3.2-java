package com.example.banking;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.annotation.Resource;

@Service
public class AccountService {

    @Resource
    private AccountDAO dao;

    @Transactional
    public void transferMoney(int fromAcc, int toAcc, double amount) {
        Account sender = dao.find(fromAcc);
        Account receiver = dao.find(toAcc);

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        dao.update(sender);
        dao.update(receiver);
    }
}
