package week5_curriculum.class_exercise_1.services.impl;

import week5_curriculum.class_exercise_1.models.Cafeteria;
import week5_curriculum.class_exercise_1.models.CustomerComparator;
import week5_curriculum.class_exercise_1.models.Customers;
import week5_curriculum.class_exercise_1.services.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {
    PriorityQueue<Customers> customersOnQueue;
    public CafeteriaServiceImpl() {
        customersOnQueue = new PriorityQueue<>(new CustomerComparator());
    }

    @Override
    public void addCustomerToQueue(Customers cus) {
        customersOnQueue.add(cus);
    }

    @Override
    public String collectMeal(Cafeteria meal) {
        if(customersOnQueue.isEmpty()) {
            return "No customer on queue";
        }
        Customers cus = customersOnQueue.poll();
        return cus.getName() + " has taken " + meal.getMealType() + ".";
    }
}
