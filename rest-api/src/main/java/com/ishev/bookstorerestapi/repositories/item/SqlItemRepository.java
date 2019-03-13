package com.ishev.bookstorerestapi.repositories.item;

import com.ishev.bookstorerestapi.models.Item;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlItemRepository implements ItemRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public SqlItemRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Item reduceItemInStockQuantity() {
        return null;
    }
}
