package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    void insertBatch(List<SetmealDish> setmealDishes);

    List<Long> getSetmealDishIdsBySetmealIds(List<Long> setmealIds);

    void deleteByIds(List<Long> setmealDishIds);

    @Select("select * from setmeal_dish where setmeal_id = #{id}")
    List<SetmealDish> getSetmealDishesBySetmealId(Long id);

    @Delete("delete from setmeal_dish where setmeal_id = #{id}")
    void deleteBySetmealId(Long id);
}
