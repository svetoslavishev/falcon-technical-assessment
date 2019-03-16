package com.ishev.bookstorerestapi.repositories.request;

import com.ishev.bookstorerestapi.models.Request;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlRequestRepository implements RequestRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public SqlRequestRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void createRequest(Request request) {

    }

    @Override
    public void deleteRequest(int id) {

    }

    @Override
    public List<Request> getAllRequests() {
        return null;
    }
}
