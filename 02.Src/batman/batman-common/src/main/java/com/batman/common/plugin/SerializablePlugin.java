package com.batman.common.plugin;

import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

public class SerializablePlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> list) {
        return false;
    }
}
