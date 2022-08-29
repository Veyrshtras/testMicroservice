package com.example.lesson4.model;

import com.example.lesson4.entity.District;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RegionItem {

    private Long id;
    private String name;
    private Set<DistrictItem> districts;

    @Getter
    @Setter
    public static class DistrictItem{
        private Long id;
        private String name;
    }
}
