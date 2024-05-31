package com.example.demo;

import java.util.Objects;

public class KitapersonalDto {
  private String name;

  public String getName() {
    return name;
  }

  public KitapersonalDto setName(final String name) {
    this.name = name;
    return this;
  }

  @Override
  public boolean equals(final Object o) {

    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final KitapersonalDto kitapersonalDto = (KitapersonalDto) o;
    return Objects.equals(name, kitapersonalDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
