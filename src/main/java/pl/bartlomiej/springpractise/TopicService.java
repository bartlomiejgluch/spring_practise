package pl.bartlomiej.springpractise;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Frame", "Spring Framework Description"),
            new Topic("2", "2 name", "2 Description"),
            new Topic("3", "3 Frame", "3 Description"));

    public List<Topic> getAllTopics() {
        return topics;
    }

}
