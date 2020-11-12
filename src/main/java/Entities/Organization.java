package Entities;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Organization {

    @NumberFormat
    private Long id;

    private String login;

    private List<User> members;

//    List<String> arguments = new ArrayList<String>();



}
