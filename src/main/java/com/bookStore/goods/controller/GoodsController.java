package com.bookStore.goods.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface GoodsController {


    public ModelAndView goodsDetail(@RequestParam("goods_id") String goods_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
    /*
    상품 상세 정보 페이지 요청할 때 호출되는 메서드. HTTP 요청으로부터 "goods_id"라는 이름의 파라미터를 받아, 메소드의 goods_id 매개변수에 할당.
    컨트롤러가 처리한 결과 데이터와 결과를 보여줄 뷰에 대한 정보를 담아 반환.
    */
    public @ResponseBody String keywordSearch(@RequestParam("keyword") String keyword, HttpServletRequest request, HttpServletResponse response) throws Exception;
    public ModelAndView searchGoods(@RequestParam("searchWord") String searchWord, HttpServletRequest request, HttpServletResponse response) throws Exception;
    /* 상품 검색 페이지 요청 시 호출되는 메서드. */
}
