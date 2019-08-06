package com.alibaba.web;

import com.alibaba.service.LinkageService;
import com.alibaba.web.base.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/linkage")
public class LinkageServlet extends BaseServlet {
    LinkageService linkageService = new LinkageService();
    private void selePro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("66666666666666");

        String str = linkageService.selePro();
        response.getWriter().print(str);

    }

    private void seleCity(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pname = request.getParameter("pname");

        System.out.println(pname);
        String str = linkageService.seleCity(pname);
        response.getWriter().print(str);
        System.out.println(str);
    }
}
