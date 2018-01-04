package com.dfs.harmony.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;

@SpringBootApplication(exclude = {ElasticsearchAutoConfiguration.class, ElasticsearchDataAutoConfiguration.class})
public class SampleJestApplication implements CommandLineRunner {

//	@Autowired
//	private CustomerRepository repository;



	public static void main(String[] args)  {SpringApplication.run(SampleJestApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

    }

}
