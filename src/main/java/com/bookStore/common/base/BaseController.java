package com.bookStore.common.base;

import com.bookStore.goods.vo.ImageFileVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public abstract class BaseController {
    private static final String CURR_IMAGE_REPO_PATH = "c:\\shopping\\file_repo";
    //업로드된 파일이 저장될 기본 경로를 문자열로 저장

    protected List<ImageFileVO> upload(MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
        return null;
    }


    //클라이언트의 요청에 따라 뷰 이름을 동적으로 결정하고, 해당 뷰를 반환하는 ModelAndView 객체를 생성
    @RequestMapping(value="/*.do", method={RequestMethod.POST, RequestMethod.GET})
    protected ModelAndView viewForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String viewName=(String) request.getAttribute("viewName");
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

}
