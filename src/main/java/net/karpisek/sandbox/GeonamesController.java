package net.karpisek.sandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeonamesController {
	
	@GetMapping("/")
	public String page() {
		//TODO: refactor to use template
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body>");
		sb.append("<h1>hi! </h1>");
		sb.append("When running locally you can try these links:");
		sb.append("<ul>");
		sb.append("<li><a href=http://localhost:8080/geonames/cities>GET cities</href></li>");
		sb.append("<li><a href=http://localhost:8080/geonames/cities/count>GET cities count</href></li>");
		sb.append("<li><a href=http://localhost:8080/h2-console>H2 console</href></li>");
		sb.append("</ul>");
		sb.append("</body></html>");
		return sb.toString();
	}
	
}