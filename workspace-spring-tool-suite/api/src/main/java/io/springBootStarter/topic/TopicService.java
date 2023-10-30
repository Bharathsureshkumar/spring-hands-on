package io.springBootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics = new ArrayList(Arrays.asList(
			new Topic("10", "Ronaldhino", "Fotball"),
			new Topic("11", "Neymar", "Football"),
			new Topic("12", "Pele", "Football"),
			new Topic("13", "Zidane", "Football")
			));
	
	public List<Topic> getAllTopic(){
		return topics;
	}
	
	
	public Topic getTopic(String id) {
		
		Topic topic = topics.stream().filter(e -> e.getId().equals(id)).findFirst().get();
		return topic;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateService(String id, Topic topic) {
		
		for(int i=0 ; i<topics.size(); i++) {
			
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
			
		}
		
	}
	
	public void deleteTopic(String id) {
		
//		for(int i=0 ; i<topics.size(); i++) {
//			
//			if(topics.get(i).getId().equals(id)) {
//				topics.remove(i);
//				break;
//			}
//		}
		
		if(topics.removeIf(e -> e.getId().equals(id)));
		
	}
}
