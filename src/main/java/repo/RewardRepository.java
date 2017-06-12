package repo;

import model.Reward;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yb
 * on 6/12/17.
 */

public interface RewardRepository extends MongoRepository<Reward, String> {

}
