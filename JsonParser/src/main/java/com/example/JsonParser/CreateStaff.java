package com.example.JsonParser;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CreateStaff {
    public static Staff createStaff() {

        Staff staff = new Staff();

        staff.setName("tjona");
        staff.setAge(29);
        staff.setExperience(1);
        staff.setPosition(new String[]{"Founder", "CTO", "Writer"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2019", new BigDecimal(10000));
            put("2020", new BigDecimal(12000));
            put("2021", new BigDecimal(14000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

        return staff;

    }

}
