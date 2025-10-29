package com.example.banking;

import org.hibernate.*;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;

@Repository
public class AccountDAO {
    @PersistenceContext
    private EntityManager em;

    public Account find(int accNo) {
        return em.find(Account.class, accNo);
    }

    public void update(Account acc) {
        em.merge(acc);
    }
}
