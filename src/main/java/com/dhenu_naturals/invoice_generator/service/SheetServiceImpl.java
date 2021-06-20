package com.dhenu_naturals.invoice_generator.service;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static java.util.List.of;

@Service
public class SheetServiceImpl implements SheetService {

    private final Sheets sheets;

    public SheetServiceImpl(Sheets sheetService) {
        this.sheets = sheetService;
    }

    @Override
    public ValueRange getSheet(String sheetId, String page) throws IOException {

        BatchGetValuesResponse response =
                sheets.spreadsheets().values().batchGet(sheetId)
                        .setRanges(of(page)).execute();

        return response.getValueRanges().get(0);
    }
}
