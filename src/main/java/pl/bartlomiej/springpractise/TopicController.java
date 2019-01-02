package pl.bartlomiej.springpractise;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping
    public List<Topic> getAllTopics() {

        return Arrays.asList(
                new Topic("spring", "Spring Frame", "Spring Framework Description"),
        new Topic("2", "2 name", "2 Description"),
        new Topic("3", "3 Frame", "3 Description"));



    }

}
