package vn.kase.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import vn.kase.jee.jpa.common.AbstractPersistenceBean;
import vn.kase.jee.jpa.entity.Information;
import vn.kase.ws.pojo.InformationException;
import vn.kase.ws.pojo.InformationListResponse;
import vn.kase.ws.pojo.InformationRequest;
import vn.kase.ws.pojo.InformationResponse;

@Stateless
@WebService
public class InformationFacade extends AbstractPersistenceBean {
    public InformationListResponse getInformation(InformationRequest informationRequest) throws InformationException {
        if (informationRequest.getDestination() == null || "".equals(informationRequest.getDestination().trim())) {
            throw new InformationException("You destination must not be empty");
        }

        List<Information> informations = findAll(Information.class, "SELECT i FROM Information i WHERE i.destination = ?1", informationRequest.getDestination());

        InformationListResponse responses = new InformationListResponse();
        for (Information information : informations) {
            InformationResponse response = new InformationResponse();
            response.setId(information.getId());
            response.setTitle(information.getTitle());
            response.setDescription(information.getDescription());

            responses.add(response);
        }
        
        return responses;
    }
}
