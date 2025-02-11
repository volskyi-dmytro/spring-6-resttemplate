package com.stpunk47.spring6resttemplate.client;

import com.stpunk47.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers();

}
