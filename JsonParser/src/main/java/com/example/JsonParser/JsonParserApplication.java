package com.example.JsonParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.example.JsonParser.CreateStaff.createStaff;




public class JsonParserApplication {

	public static void main(String[] args) {
		Class<CreateStaff> createStaff = (CreateStaff.class);


				ObjectMapper mapper = new ObjectMapper();

				Staff staff =createStaff();

				try {

					// Java objects to JSON file
					mapper.writeValue(new File("C:\\Users\\39351\\Desktop\\RepoGit\\JsonParser\\JsonParser\\src\\main\\resources\\staff.json"), staff);

					// Java objects to JSON string - compact-print
					String jsonString = mapper.writeValueAsString(staff);

					System.out.println(jsonString);

					// Java objects to JSON string - pretty-print
					String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);

					System.out.println(jsonInString2);

				} catch (IOException e) {
					e.printStackTrace();
				}

			}


		}




