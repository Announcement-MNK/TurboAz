package com.example.turboaz.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListingCreationDto {
    private Long makeId;
    private Long modelId;
    private int year;
    private int price;
    private int mileage;
    private String fuelType;
    private String bodyType;
    private String color;
    private Long cityId;
    private String gearBox;
    private boolean autoPay;
    private boolean creditOption;
    private boolean barterOption;
    private boolean leaseOption;
    private boolean cashOption;
    private String description;
    private String type;
    private List<Long> carSpecIds;
}
