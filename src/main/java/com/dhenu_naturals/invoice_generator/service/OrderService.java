package com.dhenu_naturals.invoice_generator.service;

import com.dhenu_naturals.invoice_generator.model.Order;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.util.List;

public interface OrderService {
    List<Order> generateOrderList(ValueRange valueRange);
}
