package com.dhenu_naturals.invoice_generator.service;

import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;

public interface SheetService {

    ValueRange getSheet(String sheetId,
                        String page) throws IOException;

}
