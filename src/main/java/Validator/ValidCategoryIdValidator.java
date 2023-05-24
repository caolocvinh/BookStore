package Validator;


import Validator.annotation.ValidCategoryld;
import caolocvinh.buoi456.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryld, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category!=null && category.getId()!=null;
    }

}
