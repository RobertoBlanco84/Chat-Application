package com.jensen.model.bean;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
<<<<<<< HEAD
=======
import javax.faces.bean.SessionScoped;
>>>>>>> d566f8a082f3eccdde615fe7bc13049ea778acb4
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
@ApplicationScoped 
public class MessageBean implements Serializable {
 
  
	private static final long serialVersionUID = 1L;

	@EJB
    private MessageManager mm;
 
<<<<<<< HEAD
    private Date lastUpdate;
    private Message message;
   
=======
    @SuppressWarnings("unused")
    private Date lastUpdate;
    private Message message;
 
    /**
     * Creates a new instance of MessageBean and instantiates a new Message object and Date object.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
>>>>>>> d566f8a082f3eccdde615fe7bc13049ea778acb4
	public MessageBean() {
        lastUpdate = new Date(0);
        message = new Message();
    }
<<<<<<< HEAD
  
    public Message getMessage() {
        return message;
    }
 
    public void sendMessage(ActionEvent evt) {
=======
    
   	
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
>>>>>>> d566f8a082f3eccdde615fe7bc13049ea778acb4
        mm.sendMessage(message);
    }
    
    
    /**
     * 
     * It gets the current instance ReqestContext and adds the objects of Message(user, message, date)
     * and formats to JSON. Its renders the JSON values in the xhtml page.
     * 
     * @param event awaits for ActionEvent
     */
    public void firstUnreadMessage(ActionEvent event) {
       RequestContext ctx = RequestContext.getCurrentInstance();
 
       Message m = mm.getFirstAfter(lastUpdate);
 
       ctx.addCallbackParam("ok", m!=null);
       if(m==null) {
           return;
       }
       	
       lastUpdate = m.getDateSent();
 
       ctx.addCallbackParam("user", m.getUser());
       ctx.addCallbackParam("dateSent", m.getDateSent().toString());
       ctx.addCallbackParam("text", m.getMessage());
       
 
    }
    
}

