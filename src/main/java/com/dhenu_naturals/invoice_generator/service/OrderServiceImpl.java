package com.dhenu_naturals.invoice_generator.service;

import com.dhenu_naturals.invoice_generator.model.Order;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    public List<Order> generateOrderList(ValueRange valueRange) {
        var mm = valueRange.getValues();
        var b = mm.get(1);
        return null;
    }
}
