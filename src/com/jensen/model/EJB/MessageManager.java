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

	/**
     * Add the Message object to the messages list and sets a new date. 
     * @param msg Is an Message object.
     */
    public void sendMessage(Message msg) {
        messages.add(msg);
    }
 
    /**
     * Gets the first Message object of the messages list and all the other after it.
     * @param msg Is a String
     * @return null if messages list is empty or if its not 
     * empty it returns all the Message objects.
     */
    public Message getFirstAfter(String msg, String usr) {
        if(messages.isEmpty()) {
        		System.out.println("if messages.isEmpty getFirstAfter");
            return null;
        }
       if(msg == null) {
    	   System.out.println("if msg==null getFirstAfter");
            return messages.get(0);
        }
        for(Message m : messages) {
          if(!m.getMessage().isEmpty())
        	System.out.println("For loop getFirstAfter");
                return m;
        }
        System.out.println("End of getFrirstAfter method");
       return null;
    }
 
}
