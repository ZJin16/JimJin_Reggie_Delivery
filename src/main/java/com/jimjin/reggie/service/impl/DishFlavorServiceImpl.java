package com.jimjin.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jimjin.reggie.entity.DishFlavor;
import com.jimjin.reggie.mapper.DishFlavorMapper;
import com.jimjin.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
