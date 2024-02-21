package week5_curriculum.class_activity_2A1;

import week5_curriculum.class_activity_2A1.enums.MealType;
import week5_curriculum.class_activity_2A1.model.Cafeteria;
import week5_curriculum.class_activity_2A1.model.Decadevs;
import week5_curriculum.class_activity_2A1.service.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {
        Decadevs male1 = new Decadevs("Henry Ame", false, true);
        Decadevs female1 = new Decadevs("Rose Uroko", true, false);
        Decadevs male2 = new Decadevs("Praise Abu", false, true);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();
        Cafeteria cafeteria = new Cafeteria(MealType.FRIED_RICE_AND_COLD_SLAW);

        cafeteriaService.addDevsToQueue(male1);
        cafeteriaService.addDevsToQueue(female1);
        cafeteriaService.addDevsToQueue(male2);

        //give out meal
        System.out.println(cafeteriaService.collectMeal(cafeteria));
    }
}
