package org.mybatis.samples.service;

import org.mybatis.samples.mappers.TransactionAnnotationDao;



/**
 * Service that encapsulates Dao based on annotations
 */
public class TransactionAnnotationService {
    private TransactionAnnotationDao transactionAnnotationDao;

    public TransactionAnnotationDao getTransactionAnnotationDao() {
        return transactionAnnotationDao;
    }

    public void setTransactionAnnotationDao(TransactionAnnotationDao transactionAnnotationDao) {
        this.transactionAnnotationDao = transactionAnnotationDao;
    }
}
