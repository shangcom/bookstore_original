package com.bookStore.main;

import com.bookStore.common.base.BaseController;
import com.bookStore.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;

@Controller("mainController")
@EnableAspectJAutoProxy
public class MainController extends BaseController {

    @Autowired
    private GoodsService goodsService;

}
