package vn.kase.ws.pojo;

import java.io.Serializable;

public class InformationRequest implements Serializable {
    private static final long serialVersionUID = 7980320526072364474L;

    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
