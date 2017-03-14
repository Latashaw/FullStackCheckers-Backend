package stg.Controller;

/**
 * Created by prestonbattin on 3/12/17.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CheckersDOA extends CrudRepository<CheckersEntity, Long>{

    public CheckersEntity findByid(int id);
}
