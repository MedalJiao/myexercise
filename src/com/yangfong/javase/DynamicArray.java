package com.yangfong.javase;

/**
 * Created by Bruce.Jiao on 2017/5/17.
 */
public class DynamicArray {

    public static void main(String[] args){
        String bTime = "2017-05-11 01:11:11";
        String eTime = "2017-05-12 02:22:22";
        String exbTime = "2017-05-13 03:33:33";
        String exeTime = "2017-05-14 04:44:44";
        String operateType = "operateType";
        String consignWaybillNo = "consignWaybillNo";
        String executionTag = "executionTag";
        String[] arr = {bTime, eTime, exbTime, exeTime, operateType, consignWaybillNo, executionTag};
        for (int i = 0; i<7; i++) {
            System.out.println(arr[i] + ", second:" + arr[i]);
        }
    }
}
