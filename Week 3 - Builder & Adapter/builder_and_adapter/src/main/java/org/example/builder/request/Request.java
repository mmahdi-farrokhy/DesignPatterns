package org.example.builder.request;

public class Request {
    private final String url;
    private final String method;
    private final Object headers;
    private final Object body;
    private final String agent;

    public Request(String url, String method, Object headers, Object body, String agent) {
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.agent = agent;
    }

    public void send() {
        System.out.println("Sending request to " + url);
    }
}
