package guru.springframework.springrestclientexamples.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public List<User> getUsers(Integer limit) {
		return null;
	}

}
