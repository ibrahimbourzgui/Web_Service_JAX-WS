package metier;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import data.Contact;
import data.DataContact;

@WebService(name = "contactWS")
public class ContactService {
	@WebMethod
	public Contact getContactById(@WebParam(name="codeContact") int idContact) {
		return DataContact.lstContacts[idContact];
		
	}
	@WebMethod
	public Contact[] getAllContacts () {
		return DataContact.lstContacts;
	}

}
