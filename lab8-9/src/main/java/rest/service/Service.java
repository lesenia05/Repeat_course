package rest.service;

import goods.Goods;
import persistence.dao.GoodsDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.persistence.Table;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/goods")
@Table(name = "goods")
@SessionScoped
public class Service implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private GoodsDao dao;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Goods getGoods(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createGoods(Goods goods) {
        dao.persist(goods);
        return Response.status(200).entity("Ok").build();
    }

    @DELETE
    @Path("/{id}")
    public  Response deleteGoods(@PathParam("id") Integer id) {
        dao.delete(id);
        return Response.status(200).entity("Ok").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateGoods(Goods goods) {
        dao.update(goods);
        return Response.status(200).entity("Ok").build();
    }
}