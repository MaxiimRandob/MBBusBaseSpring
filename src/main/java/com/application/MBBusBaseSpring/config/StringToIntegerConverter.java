package com.application.MBBusBaseSpring.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.text.ParseException;

public class StringToIntegerConverter implements Converter <String, Integer> {
    @Nullable
    @Override
    public Integer convert(String source) {

        return Integer.parseInt(source);

    }
}
