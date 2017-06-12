package controller;

import model.Reward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repo.RewardRepository;

import java.util.List;

/**
 * Created by yb
 * on 6/12/17.
 */

@RestController
@RequestMapping("/rewards")
public class RewardController {

    @Autowired
    RewardRepository rewardRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Reward create(@RequestBody Reward mission){

        Reward result = rewardRepository.save(mission);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{rewardId}")
    public Reward get(@PathVariable String missionId){
        return rewardRepository.findOne(missionId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/")
    public List<Reward> getAll(){
        return rewardRepository.findAll();
    }

}