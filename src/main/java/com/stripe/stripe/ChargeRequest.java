package com.stripe.stripe;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ChargeRequest {

    public enum Currency {
        EUR, USD, KZT
    }

    private String description;
    private int amount;
    private Currency currency;
    private String stripeEmail;
    private String stripeToken;
}
