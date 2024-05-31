package com.example.demo;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KitapersonalService {

  private final KitapersonalRepository kitapersonalRepository;

  public KitapersonalService(final KitapersonalRepository kitapersonalRepository) {
    this.kitapersonalRepository = kitapersonalRepository;
  }

  @Transactional(readOnly = true)
  public List<KitapersonalDto> ladeKitapersonal() {
    return kitapersonalRepository.findAll().stream()
        .map(k -> new KitapersonalDto().setName(k.getName()))
        .toList();
  }

  @Transactional
  public void erstelleKitapersonal(final KitapersonalDto kitapersonal) {
    kitapersonalRepository.saveAndFlush(new Kitapersonal().setName(kitapersonal.getName()));
  }
}
