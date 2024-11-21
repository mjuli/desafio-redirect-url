package org.example;

import lombok.Data;

@Data
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
