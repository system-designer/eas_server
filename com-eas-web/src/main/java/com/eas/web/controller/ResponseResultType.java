package com.eas.web.controller;

import com.google.gson.reflect.TypeToken;
import com.eas.domain.BaseEntity;
import com.eas.domain.vo.Result;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by RayLew on 2014/11/14.
 */
public class ResponseResultType {
    public static final Type LongType = new TypeToken<Result<Long>>() { }.getType();
    public static final Type IntegerType = new TypeToken<Result<Integer>>() { }.getType();
    public static final Type StringType = new TypeToken<Result<String>>() { }.getType();
    public static final Type BaseEntityType = new TypeToken<Result<BaseEntity>>() { }.getType();
    public static final Type BaseEntityListType = new TypeToken<Result<List<BaseEntity>>>() { }.getType();
}
