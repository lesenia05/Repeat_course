import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/goods")
public class GoodsService {

    private static Map<Integer, Goods> goodsMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Goods getGoods(@PathParam("id") Integer id) {
        return goodsMap.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createGoods(Goods goods) {
        goodsMap.put(goods.getId(), goods);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceGoods(@PathParam("id") Integer id, Goods goods) {
        goodsMap.replace(id, goods);
    }

    @DELETE
    @Path("/{id}")
    public void deleteGoods(@PathParam("id") Integer position) {
        goodsMap.remove(position);
    }
}