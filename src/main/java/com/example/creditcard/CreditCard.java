package com.example.creditcard;

import java.time.LocalDate;

public class CreditCard {

    private String cardNo;
    private String holderName;
    private LocalDate dateOfExpiry;
    private String gatewayName;
    private float creditLimit;
    private String cardType;

    public CreditCard(String cardNo, String holderName, LocalDate dateOfExpiry, String gatewayName, float creditLimit, String cardType) {
        this.cardNo = cardNo;
        this.holderName = holderName;
        this.dateOfExpiry = dateOfExpiry;
        this.gatewayName = gatewayName;
        this.creditLimit = creditLimit;
        this.cardType = cardType;
    }



    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNo='" + cardNo + '\'' +
                ", holderName='" + holderName + '\'' +
                ", dateOfExpiry=" + dateOfExpiry +
                ", gatewayName='" + gatewayName + '\'' +
                ", creditLimit=" + creditLimit +
                ", cardType='" + cardType + '\'' +
                '}';
    }

    public void showCardInfoToAlert(){
        

    }
}
