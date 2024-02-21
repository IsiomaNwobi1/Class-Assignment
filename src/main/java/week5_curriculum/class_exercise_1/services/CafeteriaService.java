package week5_curriculum.class_exercise_1.services;

import week5_curriculum.class_exercise_1.models.Cafeteria;
import week5_curriculum.class_exercise_1.models.Customers;

public interface CafeteriaService {
    public void addCustomerToQueue(Customers cus);
    public String collectMeal(Cafeteria meal);
}
