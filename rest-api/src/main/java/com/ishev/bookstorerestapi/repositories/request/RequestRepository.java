package com.ishev.bookstorerestapi.repositories.request;

import com.ishev.bookstorerestapi.models.Request;

import java.util.List;

public interface RequestRepository {

    void createRequest(Request request);
    void deleteRequest(int id);
    List<Request> getAllRequests();

}
