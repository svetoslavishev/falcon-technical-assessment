package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.models.Request;
import com.ishev.bookstorerestapi.services.request.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestRestController {

    private final RequestService requestService;

    @Autowired
    public RequestRestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping
    public void addRequest(@RequestBody Request request) {
        requestService.createRequest(request);
    }

    @DeleteMapping("/{id}")
    public void removeRequest(@PathVariable int id) {
        requestService.deleteRequest(id);
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }
}
