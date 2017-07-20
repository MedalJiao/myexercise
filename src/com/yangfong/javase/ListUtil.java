package com.yangfong.javase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017-07-13.
 */
public class ListUtil {

    /**
     *
     * @description 分割集合
     * @param
     * 		oldList:要分割的目标集合
     * 		batchSize：用户传入的每个批次的元素个数
     * @return List<List<T>> 分割后的集合集
     * @date 2017年7月13日
     */
    public static <T> List<List<T>> splitList(List<T> oldList, int batchSize) {
        if(batchSize < 1) {
            return null;
        }
        List<List<T>> result = new ArrayList<List<T>>();
        int size = oldList.size();
        int count = (size + batchSize - 1) / batchSize;
        for (int i = 0; i < count; i++) {
            List<T> subList = oldList.subList(i * batchSize,
                    ((i + 1) * batchSize > size ? size : (i + 1) * batchSize));
            result.add(subList);
        }
        return result;
    }
}
