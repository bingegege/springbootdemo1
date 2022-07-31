package com.example.springbootdemo1.service.utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 *
 * @author zhenghuan
 * @date 2022/5/17
 */
public class JsonUtil {

    private static final ObjectMapper DEFAULT_MAPPER = new ObjectMapper();

    static {
        DEFAULT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        DEFAULT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static String writeValueAsString(final Object object) {
        try {
            return DEFAULT_MAPPER.writeValueAsString(object);
        } catch (final JsonProcessingException e) {
            throw new RuntimeException("Error", e);
        }
    }

    public static <T> T readValue(final String str, final Class<T> valueType) {
        try {
            return DEFAULT_MAPPER.readValue(str, valueType);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T readValue(final byte[] src, final Class<T> valueType) {
        try {
            return DEFAULT_MAPPER.readValue(src, valueType);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T readValue(final String str, final TypeReference<T> reference) {
        try {
            return DEFAULT_MAPPER.readValue(str, reference);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

}

