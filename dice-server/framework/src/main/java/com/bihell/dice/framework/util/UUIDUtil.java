package com.bihell.dice.framework.util;

import java.util.UUID;

/**
 * todo
 */
public class UUIDUtil {

    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
    
}
