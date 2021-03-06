package com.stark.yiyu.json;

import org.json.JSONArray;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * Created by Stark on 2017/2/8.
 */
public class TypeInt {
    public static int getType(Class<?> type)
    {
        if(type!=null&&(String.class.isAssignableFrom(type)||Character.class.isAssignableFrom(type)||Character.TYPE.isAssignableFrom(type)))
            return 0;
        if(type!=null&&(Byte.TYPE.isAssignableFrom(type)||Short.TYPE.isAssignableFrom(type)||Integer.TYPE.isAssignableFrom(type)||Long.TYPE.isAssignableFrom(type)||Float.TYPE.isAssignableFrom(type)||Double.TYPE.isAssignableFrom(type)||Number.class.isAssignableFrom(type)))
            return 1;
        if(type!=null&&(Boolean.TYPE.isAssignableFrom(type)||Boolean.class.isAssignableFrom(type)))
            return 2;
        if(type!=null&&type.isArray())
            return 3;
        if(type!=null&&Connection.class.isAssignableFrom(type))
            return 4;
        if(type!=null&&Map.class.isAssignableFrom(type))
            return 5;
        if(type!=null&&List.class.isAssignableFrom(type))
            return 6;
        if(type!=null&&JSONArray.class.isAssignableFrom(type))
            return 7;
        return 8;
    }
}
