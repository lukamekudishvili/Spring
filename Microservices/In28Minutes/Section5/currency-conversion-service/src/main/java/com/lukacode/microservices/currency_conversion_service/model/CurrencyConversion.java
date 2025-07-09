package com.lukacode.microservices.currency_conversion_service.model;

import java.math.BigDecimal;

public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private double quantity;
    private double conversionRate;
    private double totalCalculatedAmount;
    private String environment;

    public CurrencyConversion(Long id, String from, String to, double quantity, double conversionRate, double totalCalculatedAmount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionRate = conversionRate;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(double totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "CurrencyConversion{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionRate=" + conversionRate +
                ", quantity=" + quantity +
                ", totalCalculatedAmount=" + totalCalculatedAmount +
                ", environment='" + environment + '\'' +
                '}';
    }
}
