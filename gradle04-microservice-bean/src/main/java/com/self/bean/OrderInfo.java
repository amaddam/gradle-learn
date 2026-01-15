package com.self.bean;




public class OrderInfo  {
    private Integer oid;
    private Integer uid;
    private String productName;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", productName='" + productName + '\'' +
                '}';
    }
}
