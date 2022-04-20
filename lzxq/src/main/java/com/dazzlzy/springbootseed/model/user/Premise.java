package com.dazzlzy.springbootseed.model.user;

/**
 * 预售项目公示对象
 */
public class Premise {
    private String	certificateTypeName;
    private String	directoryId;
    private String	dataId;
    private String	licNo;
    private String	licName;
    private String	licOwner;
    private String	licOwnerName;
    private String	licENo;
    private String	sendDate;
    private String	licSendUnitName;
    private String	endDate;
    private String	tableName;
    private String	KZ_XMMC;

    public String getCertificateTypeName() {
        return certificateTypeName;
    }

    public void setCertificateTypeName(String certificateTypeName) {
        this.certificateTypeName = certificateTypeName;
    }

    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getLicNo() {
        return licNo;
    }

    public void setLicNo(String licNo) {
        this.licNo = licNo;
    }

    public String getLicName() {
        return licName;
    }

    public void setLicName(String licName) {
        this.licName = licName;
    }

    public String getLicOwner() {
        return licOwner;
    }

    public void setLicOwner(String licOwner) {
        this.licOwner = licOwner;
    }

    public String getLicOwnerName() {
        return licOwnerName;
    }

    public void setLicOwnerName(String licOwnerName) {
        this.licOwnerName = licOwnerName;
    }

    public String getLicENo() {
        return licENo;
    }

    public void setLicENo(String licENo) {
        this.licENo = licENo;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getLicSendUnitName() {
        return licSendUnitName;
    }

    public void setLicSendUnitName(String licSendUnitName) {
        this.licSendUnitName = licSendUnitName;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getKZ_XMMC() {
        return KZ_XMMC;
    }

    public void setKZ_XMMC(String KZ_XMMC) {
        this.KZ_XMMC = KZ_XMMC;
    }

    @Override
    public String toString() {
        return "Premise{" +
                "certificateTypeName='" + certificateTypeName + '\'' +
                ", directoryId='" + directoryId + '\'' +
                ", dataId='" + dataId + '\'' +
                ", licNo='" + licNo + '\'' +
                ", licName='" + licName + '\'' +
                ", licOwner='" + licOwner + '\'' +
                ", licOwnerName='" + licOwnerName + '\'' +
                ", licENo='" + licENo + '\'' +
                ", sendDate='" + sendDate + '\'' +
                ", licSendUnitName='" + licSendUnitName + '\'' +
                ", endDate='" + endDate + '\'' +
                ", tableName='" + tableName + '\'' +
                ", KZ_XMMC='" + KZ_XMMC + '\'' +
                '}';
    }
}
