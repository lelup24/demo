package com.example.demo;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/kitapersonal")
public class TestController {
    private final KitapersonalService kitapersonalService;

    public TestController(final KitapersonalService kitapersonalService) {
        this.kitapersonalService = kitapersonalService;
    }

    @GetMapping
    public ResponseEntity<List<KitapersonalDto>> ladeKitapersonal() {
        return ResponseEntity.ok(kitapersonalService.ladeKitapersonal());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> speichereKitapersonal(@RequestBody KitapersonalDto kitapersonalDto) {
        kitapersonalService.erstelleKitapersonal(kitapersonalDto);
        return ResponseEntity.ok().build();
    }

}
