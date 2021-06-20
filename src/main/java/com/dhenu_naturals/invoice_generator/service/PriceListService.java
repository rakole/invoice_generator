package com.dhenu_naturals.invoice_generator.service;

import com.dhenu_naturals.invoice_generator.model.ItemPrice;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.util.List;

public interface PriceListService {
    List<ItemPrice> generatePriceList(ValueRange valueRange);
}
