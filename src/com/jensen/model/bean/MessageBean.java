package com.jensen.model.bean;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import com.jensen.model.EJB.Message;
import com.jensen.model.EJB.MessageManager;

/**
 * MessageBean object with getter and primefaces methods to handle messages. This class is a ManagedBean and
 * it uses SessionScoped.
 * 
 * <p>Created on Dec 14, 2017<p>
 * @author Saikat Talukder And Roberto
 * @version 1.0
 *
 */

@ManagedBean
@SessionScoped 
public class MessageBean implements Serializable {
 
	private static final long serialVersionUID = 1L;

	@EJB
    private MessageManager mm;
 
    @SuppressWarnings("unused")
    private Date lastUpdate;
    private Message message;
 
    /**
     * Creates a new instance of MessageBean and instantiates a new Message object and Date object.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public MessageBean() {
        lastUpdate = new Date(0);
        message = new Message();
    }

  	
   /**
    * @return the message Object so you can access the Message Object
    */
    public Message getMessage() {
        return message;
    }
    
    /**
     * Is an ActionEvent handler for sending messages.
     * 
     * @param event awaits for ActionEvent
     */
    public void sendMessage(ActionEvent event) {
        mm.sendMessage(message);
    }
    
    
    /**
     * 
     * It gets the current instance ReqestContext and adds the objects of Message(user, message, date)
     * and formats to JSON. Its renders the JSON values in the xhtml page.
     * 
     * @param event awaits for ActionEvent
     */
    public void unreadMessages(ActionEvent event) {
    	RequestContext ctx = RequestContext.getCurrentInstance();
 
       Message m = mm.getFirstAfter(lastUpdate);
 
       ctx.addCallbackParam("ok", m!=null);
       if(m==null) {
           return;
       }
       	
       lastUpdate = m.getDateSent();
       
       ctx.addCallbackParam("user", m.getUser());
       ctx.addCallbackParam("text", m.getMessage());
       
 
    }
    
}

