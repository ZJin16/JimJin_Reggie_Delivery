package com.jimjin.reggie.dto;

import com.jimjin.reggie.entity.Setmeal;
import com.jimjin.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
