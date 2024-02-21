package week5_curriculum.class_exercise_1;

import week5_curriculum.class_exercise_1.enums.DiffMeals;
import week5_curriculum.class_exercise_1.models.Cafeteria;
import week5_curriculum.class_exercise_1.models.Customers;
import week5_curriculum.class_exercise_1.services.CafeteriaService;
import week5_curriculum.class_exercise_1.services.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {
        Customers customer1 = new Customers("Stella", 25);
        Customers customer2 = new Customers("Ciel", 20);
        Customers customer3 = new Customers("Rose", 65);
        Customers customer4 = new Customers("Belle", 50);

        Cafeteria cafeteria1 = new Cafeteria(DiffMeals.BEANS_AND_DOD0);
        Cafeteria cafeteria2 = new Cafeteria(DiffMeals.SEMO_AND_EGUSI);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();
        cafeteriaService.addCustomerToQueue(customer1);
        cafeteriaService.addCustomerToQueue(customer2);
        cafeteriaService.addCustomerToQueue(customer3);
        cafeteriaService.addCustomerToQueue(customer4);

        System.out.println(cafeteriaService.collectMeal(cafeteria1));
        System.out.println(cafeteriaService.collectMeal(cafeteria2));

    }
}
