package com.spdb.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.spdb.utils.PdfboxUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PdfSubtract {

    public static void main(String[] args) throws IOException {
        String pdfPath="D:\\PDF\\未命名1_加水印.pdf";
        PdfReader reader = new PdfReader(pdfPath);
        reader.getPageSize(1);
        com.itextpdf.text.Rectangle pageSize = reader.getPageSize(1);
        float height1 = pageSize.getHeight();
        float width1 = pageSize.getWidth();
        System.out.println("width = "+width1+"pt, height = "+height1 + "pt");
        Rectangle textRrect = new Rectangle(0, 0, 595, 1000);
        String strContent = PdfboxUtils.readRectangelText(pdfPath, 0, textRrect);
        System.out.println(strContent);
        // 保存图片
        Rectangle imgRrect = new Rectangle(0, 470, 595, 340);
        BufferedImage bufImage = PdfboxUtils.readRectangelImage(pdfPath, 0, imgRrect);
        File outputfile = new File("D:\\pdfImage4.jpg");
        ImageIO.write(bufImage, "png", outputfile);

    }
}
