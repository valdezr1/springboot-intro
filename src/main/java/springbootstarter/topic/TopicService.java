package springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic ("java", "Core Java", "Core Java Description"),
            new Topic ("algorithms", "Advanced Algorithms", "Advanced Algorithms Description")
            );

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
