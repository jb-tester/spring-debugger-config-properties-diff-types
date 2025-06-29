package org.example.aaa;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.EnumMap;
import java.util.Map;


@ConfigurationProperties(prefix = "my.prefix")
class EnumMapConfigProperties {
    EnumMap<SomeEnum, String> enumMap;
    Map<SomeEnum, String> normalMap;

    public EnumMap<SomeEnum, String> getEnumMap() {
        return enumMap;
    }

    public void setEnumMap(EnumMap<SomeEnum, String> enumMap) {
        this.enumMap = enumMap;
    }

    public Map<SomeEnum, String> getNormalMap() {
        return normalMap;
    }

    public void setNormalMap(Map<SomeEnum, String> normalMap) {
        this.normalMap = normalMap;
    }

    public enum SomeEnum {
        FIRST, SECOND, THIRD;
    }
}
