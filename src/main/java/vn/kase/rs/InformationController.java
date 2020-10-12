package vn.kase.rs;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import vn.kase.jee.jpa.common.AbstractPersistenceBean;
import vn.kase.jee.jpa.entity.Information;
import vn.kase.rs.pojo.InformationRequest;
import vn.kase.rs.pojo.InformationResponse;

@Path("/information")
@Produces("application/json")
@Consumes("application/json")
public class InformationController extends AbstractPersistenceBean {
    @POST
    @Path("/create")
    @Transactional
    public InformationResponse create(InformationRequest request) {
        Information information = new Information();
        information.setTitle(request.getTitle());
        information.setDescription(request.getDescription());
        information.setDestination(request.getDestination());

        entityManager.persist(information);

        InformationResponse response = new InformationResponse();
        response.setId(information.getId());
        return response;
    }
}
