package com.senko.msscbrewery.services;

import com.senko.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerId(UUID beerId);
}
