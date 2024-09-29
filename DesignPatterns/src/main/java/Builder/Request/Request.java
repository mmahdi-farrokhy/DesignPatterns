package Builder.Request;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Request {
    private final String url;
    private final String method;
    private final Object headers;
    private final Object body;
    private final String agent;

    public void send() {
        System.out.println("Sending request to " + url);
    }
}
