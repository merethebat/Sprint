import org.springframework.web.client.RestTemplate;

public void getAllPassengers() {
    RestTemplate restTemplate = new RestTemplate();
    String url = "http://localhost:8080/passengers";
    String response = restTemplate.getForObject(url, String.class);
    System.out.println(response);
}