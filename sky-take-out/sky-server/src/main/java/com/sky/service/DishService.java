package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    DishVO getDishByIdwithFlavor(Long id);

    void updateDishWithFlavor(DishDTO dishDTO);

    void changeStatus(Integer status, Long id);

    List<Dish> getDishesByCategoryId(Long categoryId);

    List<DishVO> listWithFlavor(Dish dish);

}
