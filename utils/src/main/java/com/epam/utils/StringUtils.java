package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isParsable(str)) {
            return NumberUtils.createNumber(str).doubleValue() > 0;
        }
        return false;
    }
}