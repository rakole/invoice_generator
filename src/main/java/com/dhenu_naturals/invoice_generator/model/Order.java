package com.dhenu_naturals.invoice_generator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    Map<String, Item> orderItems;
    private String emailProperty;
    private String name;
    private String contactDetails;
    private String deliveryAddress;
    private DeliveryOption deliveryOption;
    private String location;
}
