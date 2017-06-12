package model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by yb
 * on 6/12/17.
 */

@Data
@Document(collection="reward")
public class Reward {


    @Id
    private String id;

    private String name;
    private String description;
    private int pointCost;


}
