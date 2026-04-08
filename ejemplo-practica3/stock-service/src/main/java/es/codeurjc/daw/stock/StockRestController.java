package es.codeurjc.daw.stock;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stocks")
public class StockRestController {

	@GetMapping("/")
	public StockDTO getStock(@RequestBody BookBasicDTO bookDTO) {
		return new StockDTO(bookDTO.id(), bookDTO.title(), new Random().nextInt(100));
	}
}
