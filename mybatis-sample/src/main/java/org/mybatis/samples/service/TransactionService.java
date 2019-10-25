package org.mybatis.samples.service;

import org.mybatis.samples.mappers.TransactionDao;


/**
 * Service that encapsulates Dao based on xml config
 */
public class TransactionService {
    private TransactionDao transactionDao;

    public TransactionDao getTransactionDao() {
        return transactionDao;
    }

    public void setTransactionDao(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }
}
