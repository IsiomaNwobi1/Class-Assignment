package week5_curriculum.class_activity_2A1.model;

import week5_curriculum.class_activity_2A1.enums.MealType;

public class Cafeteria {
    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
