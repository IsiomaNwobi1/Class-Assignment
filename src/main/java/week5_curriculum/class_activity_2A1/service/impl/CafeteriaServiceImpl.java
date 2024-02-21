package week5_curriculum.class_activity_2A1.service.impl;

import week5_curriculum.class_activity_2A1.model.Cafeteria;
import week5_curriculum.class_activity_2A1.model.DecadevComparator;
import week5_curriculum.class_activity_2A1.model.Decadevs;
import week5_curriculum.class_activity_2A1.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {

    PriorityQueue<Decadevs> devOnQueue;

    public CafeteriaServiceImpl(){
        devOnQueue = new PriorityQueue<>(new DecadevComparator());
    }

    @Override
    public void addDevsToQueue(Decadevs devs) {
        devOnQueue.add(devs);
    }

    @Override
    public String collectMeal(Cafeteria meal) {
        if(devOnQueue.isEmpty()) {
            return "No devs is on the queue";
        }
        Decadevs devs = devOnQueue.poll();

        return devs.getName() + " has taken " + meal.getMealType() + ".";
    }
}
