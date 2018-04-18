package com.example.boot;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.boot.dao.UserReactiveRepository;
import com.example.boot.entity.User;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/**
 * 
 * @author KL 
 * @date  2018年3月3日
 * @description 模拟2条用户数据
 *
 */
/*@Component
@Slf4j
class DataInitializer implements CommandLineRunner {

	private final UserReactiveRepository userRepository;

	public DataInitializer(UserReactiveRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String[] args) {
		log.info("数据初始化 ...");
		 userRepository.deleteAll();
	        userRepository.saveAll(sampleUsers())
	                .doOnComplete(() -> System.out.println("Count:"+userRepository.count().block()))
	                .subscribe();
	}
	
	private List<User> sampleUsers()
    {
        return Arrays.asList(
                new User("uid1", "Admin",  "11"),
                new User("uid2", "Siva",  "11"),
                new User("uid3", "Bernard", "21"),
                new User("uid4", "John",  "22"),
                new User("uid5", "Mike",  "23")
               );
    }

}*/
