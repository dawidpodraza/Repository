package com.example.muslibry;

import com.example.muslibry.model.Song;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MuslibryApplication<SongRepository> {

	public static void main(String[] args) {
        SpringApplication.run(MuslibryApplication.class, args);
	}
    

}
