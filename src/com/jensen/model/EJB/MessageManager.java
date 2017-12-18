package com.jensen.model.EJB;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * MessageManger is Singelton class and that has a synchronizedList of messages. MessageManager takes care of 
 * sending messages. It iterates through the list of messages return null if its empty otherwise returns all the
 * messages the list contains.
 * 
 * <p>Created on Dec 15, 2017<p>
 * @author Saikat Talukder And Roberto
 * @version 1.0
 *
 */

@Singleton
@Startup
public class MessageManager{
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private final List<Message> messages = Collections.synchronizedList(new LinkedList());
    private int currentMessageId = 1;
	/**
     * Add the Message object to the messages list
     * @param msg Is an Message object.
     */
    
    public void sendMessage(Message msg) {
    	System.out.println(currentMessageId);
    	messages.add(msg);
        msg.setMessageId(currentMessageId);
        currentMessageId++;
        
    }
 
    /**
     * Gets the first Message object of the messages list and all the other after it.
     * @param msgId Is an int
     * @return null if messages list is empty or if its not 
     * empty it returns all the Message objects.
     */
    public Message getFirstAfter(int msgId){
        if(messages.isEmpty()) 
            return null;
        if(msgId == 0) 
            return messages.get(0);
        
        for(Message m : messages) {
          if(m.getMessageId() > msgId)
                return m;
        }
       
       //System.out.println(msgId);
       return null;
    }
 
}
