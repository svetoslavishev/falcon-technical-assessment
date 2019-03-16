package com.ishev.bookstorerestapi.services.request;

import com.ishev.bookstorerestapi.models.Request;
import com.ishev.bookstorerestapi.repositories.request.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private RequestRepository requestRepository;

    @Autowired
    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public void createRequest(Request request) {
        requestRepository.createRequest(request);
    }

    @Override
    public void deleteRequest(int id) {
        requestRepository.deleteRequest(id);
    }

    @Override
    public List<Request> getAllRequests() {
        return requestRepository.getAllRequests();
    }
}
