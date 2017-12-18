package com.jensen.model.bean;
import java.io.Serializable;
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
	private Message message;
	private int tempMsgId;


	/**
	 * Creates a new instance of MessageBean and instantiates a new Message object and Date object.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MessageBean() {
		message = new Message();
		tempMsgId = 0;
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
	 * It gets the current instance ReqestContext and adds the objects of Message(user, message)
	 * and formats to JSON. Its renders the JSON values in the xhtml page.
	 * 
	 * @param event awaits for ActionEvent
	 */
	public void unreadMessages(ActionEvent event) {
		RequestContext reqContext = RequestContext.getCurrentInstance();
		
		Message m = mm.getFirstAfter(tempMsgId);
		
		reqContext.addCallbackParam("ok", m!=null);
		if(m==null) {
			return;
		}
		
		tempMsgId = m.getMessageId();
		
		reqContext.addCallbackParam("user", m.getUser());
		reqContext.addCallbackParam("text", m.getMessage());

	}

}

