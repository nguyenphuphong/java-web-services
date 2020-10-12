package vn.kase.ws.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InformationListResponse implements Serializable {
    private static final long serialVersionUID = 6993541617315755118L;

    private List<InformationResponse> informations = new ArrayList<>();

    public List<InformationResponse> getInformations() {
        return informations;
    }

    public void add(InformationResponse information) {
        informations.add(information);
    }

    public void setInformations(List<InformationResponse> informations) {
        this.informations = informations;
    }
}
