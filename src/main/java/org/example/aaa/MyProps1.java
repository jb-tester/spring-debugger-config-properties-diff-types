package org.example.aaa;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;


@ConfigurationProperties(prefix = "custom.config")
class MyProps1 {
    String prop0;
    String prop1;
    String[] prop2;
    List<String> prop3;
    Map<String, String> prop4;
    NestedPojo prop5;
    NestedPojo[] prop6;
    Map<String, NestedPojo> prop7;

    public Map<String, NestedPojo> getProp7() {
        return prop7;
    }

    public void setProp7(Map<String, NestedPojo> prop7) {
        this.prop7 = prop7;
    }

    public NestedPojo[] getProp6() {
        return prop6;
    }

    public void setProp6(NestedPojo[] prop6) {
        this.prop6 = prop6;
    }

    public NestedPojo getProp5() {
        return prop5;
    }

    public void setProp5(NestedPojo prop5) {
        this.prop5 = prop5;
    }

    public Map<String, String> getProp4() {
        return prop4;
    }

    public void setProp4(Map<String, String> prop4) {
        this.prop4 = prop4;
    }

    public String getProp0() {
        return prop0;
    }

    public void setProp0(String prop0) {
        this.prop0 = prop0;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String[] getProp2() {
        return prop2;
    }

    public void setProp2(String[] prop2) {
        this.prop2 = prop2;
    }

    public List<String> getProp3() {
        return prop3;
    }

    public void setProp3(List<String> prop3) {
        this.prop3 = prop3;
    }
    public static class NestedPojo {
        String prop0;
        String prop1;
        List<String> prop2;
        List<String> prop3;
        Map<String, String> prop4;

        public String getProp0() {
            return prop0;
        }

        public void setProp0(String prop0) {
            this.prop0 = prop0;
        }

        public String getProp1() {
            return prop1;
        }

        public void setProp1(String prop1) {
            this.prop1 = prop1;
        }

        public List<String> getProp2() {
            return prop2;
        }

        public void setProp2(List<String> prop2) {
            this.prop2 = prop2;
        }

        public List<String> getProp3() {
            return prop3;
        }

        public void setProp3(List<String> prop3) {
            this.prop3 = prop3;
        }

        public Map<String, String> getProp4() {
            return prop4;
        }

        public void setProp4(Map<String, String> prop4) {
            this.prop4 = prop4;
        }
    }
}
