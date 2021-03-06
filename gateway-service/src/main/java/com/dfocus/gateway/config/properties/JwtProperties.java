package com.dfocus.gateway.config.properties;

import com.google.common.collect.Maps;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * Author: qfwang
 * Date: 2017-10-23 下午12:16
 */
@RefreshScope
@Component
@ConfigurationProperties(prefix = "zuul.jwt")
public class JwtProperties {
    private boolean enabled;
    private Map<String,Boolean> bos = Maps.newHashMap();

    public JwtProperties() {
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public Optional<Boolean> getBo(String key) {
        return Optional.ofNullable(bos.get(key));
    }
    public Map<String, Boolean> getBos() {
        return bos;
    }

    public void setBos(Map<String, Boolean> bos) {
        this.bos = bos;
    }
}
