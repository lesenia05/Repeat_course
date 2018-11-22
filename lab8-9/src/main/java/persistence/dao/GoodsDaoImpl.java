package persistance.dao;

import goods.Goods;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class GoodsDaoImpl extends AbstractDao<Goods> implements GoodsDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Goods> getEntityClass() {
        return Goods.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}