package org.example.builder.request;

public class RequestBuilder {
    private String url = "";
    private String method = "GET";
    private Object headers = new Object();
    private Object body = new Object();
    private String agent = "default";

    public static RequestBuilder aRequest() {
        return new RequestBuilder();
    }

    public RequestBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public RequestBuilder withMethod(String method) {
        this.method = method;
        return this;
    }

    public RequestBuilder withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    public RequestBuilder withBody(Object body) {
        this.body = url;
        return this;
    }

    public RequestBuilder withAgent(String agent) {
        this.agent = agent;
        return this;
    }

    public Request build() {
        return new Request(this.url, this.method, this.headers, this.body, this.agent);
    }
}
