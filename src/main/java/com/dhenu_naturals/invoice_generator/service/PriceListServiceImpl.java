package com.dhenu_naturals.invoice_generator.service;

import com.dhenu_naturals.invoice_generator.model.ItemPrice;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class PriceListServiceImpl implements PriceListService {

    public List<ItemPrice> generatePriceList(ValueRange valueRange) {
        return valueRange.getValues()
                .stream().skip(1).map(x -> {
                    if (x.size() == 2 && null != x.get(0) && null != x.get(1)) {
                        String name = (String) x.get(0);
                        Double price = Double.parseDouble((String) x.get(1));
                        return new ItemPrice(name, price);
                    } else {
                        return null;
                    }
                }).filter(Objects::nonNull).collect(Collectors.toList());
    }
}
