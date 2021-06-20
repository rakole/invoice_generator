package com.dhenu_naturals.invoice_generator.config;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsRequestInitializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Component
@Configuration
public class GoogleApiConfig {

    @Value("${google.spreadSheets.apiKey}")
    private String key;

    public String getKey() {
        return key;
    }

    @Bean
    public NetHttpTransport getNetHttpTransport() {
        try {
            return GoogleNetHttpTransport.newTrustedTransport();
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public GsonFactory getGsonFactory() {
        return GsonFactory.getDefaultInstance();
    }

    @Bean
    public Sheets getSheets() {
        return new Sheets.Builder(getNetHttpTransport(), getGsonFactory(), null)
                .setSheetsRequestInitializer(new SheetsRequestInitializer(getKey())).build();
    }

}
