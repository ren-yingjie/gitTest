package com.zhongwang.data.entity;

public class SupplierZs0026WithBLOBs extends SupplierZs0026 {
    private String type;

    private String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}