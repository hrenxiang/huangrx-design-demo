package com.huangrx.design;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author hrenxiang
 * @since 2022-05-12 10:24 PM
 */
@Data
@Component
@ConfigurationProperties(prefix = "huangrx")
public class hh {

    private List<gg> hobby;

    @Data
    public static class gg {
        private String ss;
    }
}
