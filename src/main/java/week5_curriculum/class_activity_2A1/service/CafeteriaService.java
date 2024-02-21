package week5_curriculum.class_activity_2A1.service;

import week5_curriculum.class_activity_2A1.model.Cafeteria;
import week5_curriculum.class_activity_2A1.model.Decadevs;

public interface CafeteriaService {
    public void addDevsToQueue (Decadevs devs);
    public String collectMeal (Cafeteria meal);
}
