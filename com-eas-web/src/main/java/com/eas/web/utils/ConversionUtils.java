package com.eas.web.utils;

import com.eas.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RayLew on 2014/11/22.
 */
public class ConversionUtils {

    /**
     *
     * @param items
     * @return
     */
    public static String longListToString(List<Long> items) {
        StringBuilder sb = new StringBuilder("");
        if (items != null && items.size() > 0) {
            for (Long item : items) {
                if(sb.length()>0){
                    sb.append(",");
                }
                sb.append(Long.toString(item));
            }
        }
        return sb.toString();
    }

    /**
     *
     * @param longStr
     * @return
     */
    public static ArrayList<Long> stringToLongList(String longStr){
        if(StringUtils.isEmpty(longStr)) {
            return null;
        }

        String[] arr = longStr.split(",");
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i =0;i<arr.length;i++) {
            list.add(Long.parseLong(arr[i]));
        }
        return list;
    }
}
