package app;

import model.Reward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import repo.RewardRepository;

@SpringBootApplication
@EnableMongoRepositories({"repo"})
public class DockerPlayRewardApplication implements CommandLineRunner {

    @Autowired
    RewardRepository rewardRepository;

    public static void main(String[] args) {
        SpringApplication.run(DockerPlayRewardApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        rewardRepository.deleteAll();

        Reward reward = new Reward();
        reward.setId("1");
        reward.setName("The Biggest reward ever");
        reward.setDescription("The biggest reward - just take a beer!");
        reward.setPointCost(2);

        rewardRepository.save(reward);

        for (Reward reward1 : rewardRepository.findAll()) {
            System.out.println(reward1.toString());
        }
    }
}
