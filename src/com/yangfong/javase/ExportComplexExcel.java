package com.yangfong.javase;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.FileOutputStream;

/**
 * 导出复杂表头的excel，例如含有合并单元格等
 * Created by dell on 2017-06-16.
 */
public class ExportComplexExcel {

    public static void main(String[] args) throws Exception{
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("demo-sheet");

        /* 设置style */
        HSSFCellStyle style = wb.createCellStyle();

        HSSFFont font = wb.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short)12);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);
        //水平居中
        style.setAlignment(HorizontalAlignment.CENTER);
        //垂直居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        //设置边框
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        /* 第一行 */
        HSSFRow row01 = sheet.createRow(0);
        row01.setHeightInPoints(14f);

        /* 第1单元格 序号 */
        HSSFCell cell01 = row01.createCell(0);
        cell01.setCellValue("序号");
        //通过实验得知，CellRangeAddress中的参数指的是单元格序号，而不是边框序号
        CellRangeAddress serialNo = new CellRangeAddress(0,2,0,0);
        sheet.addMergedRegion(serialNo);
        cell01.setCellStyle(style);

        /* 第2单元格 年级 */
        HSSFCell cell02 = row01.createCell(1);
        cell02.setCellValue("年级");
        CellRangeAddress grade = new CellRangeAddress(0,0,1,5);
        sheet.addMergedRegion(grade);
        cell02.setCellStyle(style);

        /* 第二行 */
        HSSFRow row02 = sheet.createRow(1);
        row02.setHeightInPoints(14f);

        /* 第1单元格 高一 */
        HSSFCell cell21 = row02.createCell(1);
        cell21.setCellValue("高一");
        CellRangeAddress first = new CellRangeAddress(1,1,1,2);
        sheet.addMergedRegion(first);
        cell21.setCellStyle(style);
        //如果在行上加上了HSSFCellStyle，那么该行所有单元格都将加载该样式
        row01.setRowStyle(style);
        row02.setRowStyle(style);

        /* 第2单元格 高二 */
        HSSFCell cell22 = row02.createCell(3);
        cell22.setCellValue("高二");
        CellRangeAddress second = new CellRangeAddress(1,1,3,4);
        sheet.addMergedRegion(second);
        cell22.setCellStyle(style);

        /* 第3单元格 高三 */
        HSSFCell cell23 = row02.createCell(5);
        cell23.setCellValue("高三");
        cell23.setCellStyle(style);

        /* 第三行 */
        HSSFRow row03 = sheet.createRow(2);
        row03.setHeightInPoints(14f);

        HSSFCell cell31 = row03.createCell(1);
        cell31.setCellValue("1-1班");
        HSSFCell cell32 = row03.createCell(2);
        cell32.setCellValue("1-2班");
        HSSFCell cell33 = row03.createCell(3);
        cell33.setCellValue("2-1班");
        HSSFCell cell34 = row03.createCell(4);
        cell34.setCellValue("2-2班");
        HSSFCell cell35 = row03.createCell(5);
        cell35.setCellValue("3-1班");

        /* 将表格写入本地文件 */
        FileOutputStream fos = new FileOutputStream("D:/complexDemo.xls");
        wb.write(fos);
        if(fos != null) {
            fos.close();
        }
    }
}
