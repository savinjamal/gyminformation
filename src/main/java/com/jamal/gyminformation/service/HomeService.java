package com.jamal.gyminformation.service;

import com.jamal.gyminformation.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

  public  List<Trainer> getTrainers(){
      List<Trainer> trainer = new ArrayList<>();

      Trainer trainer1 = new Trainer(1, "https://hips.hearstapps.com/hmg-prod/images/portrait-of-a-trainer-in-gym-royalty-free-image-1584723855.jpg","Trainer1", "Muscle Buildup");
      Trainer trainer2 = new Trainer(2, "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/mh-trainer-2-1533576998.png","Trainer2", "Fat Reduction");

      trainer.add(trainer1);
      trainer.add(trainer2);

      return trainer;
    }

    public  List<Trainer> searchTrainer(String trainerName){
        List<Trainer> trainer = new ArrayList<>();

        Trainer trainer1 = new Trainer(1, "https://hips.hearstapps.com/hmg-prod/images/portrait-of-a-trainer-in-gym-royalty-free-image-1584723855.jpg",trainerName, "Muscle Buildup");

        trainer.add(trainer1);

        return trainer;
    }
}
