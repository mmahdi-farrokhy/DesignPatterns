package org.example.builder.request;

public class APIService {

    public void fetchUsers() {
        Request request = RequestBuilder.aRequest()
                .withUrl("https://jsonplaceholder.typicode.com/user")
                .withMethod("POST")
                .build();
    }
}
