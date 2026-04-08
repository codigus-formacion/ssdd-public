package es.codeurjc.daw.library.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import es.codeurjc.daw.library.dto.BookBasicDTO;
import es.codeurjc.daw.library.dto.StockDTO;

@Service
public class StockService {

    @Value("${stock.service.url}")
    private String stockServiceUrl;

    public StockDTO getStock(BookBasicDTO bookBasicDTO) {
        return RestClient.create()
                .method(HttpMethod.GET)
                .uri(stockServiceUrl + "/api/stocks/")
                .body(bookBasicDTO)
                .retrieve()
                .body(StockDTO.class);
    }

}
