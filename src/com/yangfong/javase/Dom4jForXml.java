package com.yangfong.javase;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Dom4jForXml {

    @Test
    public void testDom4j(){
        try {
            //创建SAXReader对象
            SAXReader reader = new SAXReader();
            //读取文件，转换为Document对象
            Document document = reader.read(new File("src/com/yangfong/web/struts.xml"));
            //获取根节点元素
            Element rootElement = document.getRootElement();
            //遍历
            listNodes(rootElement);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 遍历当前节点下所有的节点
     * @param node 当前节点
     */
    private void listNodes(Element node){
        //获取当前节点的所有属性节点
        List<Attribute> attributes = node.attributes();
        //遍历属性节点
        for (Attribute attribute : attributes) {
            System.out.println("属性："+attribute.getName()+" = "+attribute.getValue());
        }
        //如果当前节点内容不为空，输出
        if(StringUtils.isNotEmpty(node.getTextTrim())){
            System.out.println("当前节点"+node.getName()+" ： "+node.getText());
        }
        //迭代当前节点下的所有子节点
        Iterator<Element> iterator = node.elementIterator();
        while(iterator.hasNext()){
            Element next = iterator.next();
            listNodes(next);
        }
    }
}
