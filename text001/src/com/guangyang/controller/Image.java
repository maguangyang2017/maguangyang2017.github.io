package com.guangyang.controller;

import com.guangyang.utils.ImageUtils;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by 马光阳 on 2017/7/3.
 */
public class Image extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Pragme","No-cache");
        resp.setHeader("Cache-Control","no-cache");
        resp.setDateHeader("Espires",0);
        resp.setContentType("image/jpeg");
        HttpSession httpSession = req.getSession(true);

        String code = ImageUtils.generateVerifyCode(4);
        httpSession.setAttribute("vcode","code");
        ImageUtils.outputImage(100,40,resp.getOutputStream(),code);
//        BufferedImage image = new BufferedImage(100,30,BufferedImage.TYPE_INT_BGR);
//        Random random = new Random();
//        Graphics2D graphics2D = image.createGraphics();
//        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//        graphics2D.setColor(Color.white);
//        ImageIO.write(image,"jpg",resp.getOutputStream());


    }
}
