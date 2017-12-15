package com.jensen.model.EJB;

import java.util.Collections;
import java.util.Date;
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
 * @param <E>
 *
 */

@Singleton
@Startup
public class MessageManager{
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private final List<Message> messages = Collections.synchronizedList(new LinkedList());
  //  private final List<DateBean> date = Collections.synchronizedList(new LinkedList());
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private final List<UserBean> user = Collections.synchronizedList(new LinkedList());
    
    /**
     * Add the Message object to the messages list and sets a new date. 
     * @param msg Is an Message object.
     */
    public void sendMessage(Message msg, UserBean usr) {
        messages.add(msg);
       // date.add(datez);
        user.add(usr);
        //msg.setDateSent(new Date());
    }
 
    /**
     * Gets the first Message object of the messages list and all the other after it.
     * @param after Is a Date object
     * @return null if messages list is empty or if its not 
     * empty it returns all the Message objects.
     */
    public Message getFirstMessage() {
        if(messages.isEmpty())
            return null;
        if(messages == null)
            return messages.get(0);
        for(Message m : messages) {
            if(m.getMessage() != null)
                return m;
        }
        return null;
    }
    
   /* public DateBean getCurrentDate() {
        if(date.isEmpty())
            return null;
        if(after == null)
            return messages.get(0);
        for(Message m : messages) {
            if(m.getDateSent().after(after))
                return m;
        }
        return null;
    }*/
    
    public UserBean getCurrentUser() {
        if(user.isEmpty())
            return null;
       if(user == null)
            return user.get(0);
        for(UserBean u : user) {
            if(u.getUser() != null)
                return u;
        }
        return null;
    }
 
}
