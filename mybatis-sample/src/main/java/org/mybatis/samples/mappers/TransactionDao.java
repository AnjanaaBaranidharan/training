package org.mybatis.samples.mappers;

import org.mybatis.samples.model.Transaction;

import java.util.List;


/**
 * Dao based on XML mapping
 */
public interface TransactionDao {

    List<Transaction> findAll();

    void insertTransaction(Transaction transaction);
}
