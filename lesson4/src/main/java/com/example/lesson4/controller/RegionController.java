package com.example.lesson4.controller;

import com.example.lesson4.entity.Region;
import com.example.lesson4.model.RegionItem;
import com.example.lesson4.service.RegionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/region")
public class RegionController {
    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }
    @GetMapping("{id}")
    public ResponseEntity get(@PathVariable Long id){
        return ResponseEntity.ok(regionService.findOne(id));
    }

    @PostMapping
    public ResponseEntity add(@RequestBody RegionItem regionItem){
        return ResponseEntity.ok(regionService.add(regionItem));
    }
    @PutMapping("{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody RegionItem regionItem){
        return ResponseEntity.ok(regionService.update(id, regionItem));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id){
        regionService.delete(id);
        return ResponseEntity.ok().build();
    }
}
