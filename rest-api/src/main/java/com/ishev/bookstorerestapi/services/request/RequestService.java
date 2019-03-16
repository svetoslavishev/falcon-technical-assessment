package com.ishev.bookstorerestapi.services.request;

import com.ishev.bookstorerestapi.models.Request;

import java.util.List;

public interface RequestService {

    void createRequest(Request request);
    void deleteRequest(int id);
    List<Request> getAllRequests();

}
