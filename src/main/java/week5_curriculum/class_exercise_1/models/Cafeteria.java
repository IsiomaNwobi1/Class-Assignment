package week5_curriculum.class_exercise_1.models;

import week5_curriculum.class_activity_2A1.enums.MealType;
import week5_curriculum.class_exercise_1.enums.DiffMeals;

public class Cafeteria {

    private DiffMeals mealType;

    public Cafeteria(DiffMeals mealType) {
        this.mealType = mealType;
    }

    public DiffMeals getMealType() {
        return mealType;
    }
}
