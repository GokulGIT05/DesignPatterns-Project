package dp14.behavioral_02.mediator;

import java.util.ArrayList;
import java.util.List;

public class Gk4ChatMediatorImpl implements Gk1ChatMediatorInterface {

	private List<Gk2UserAbstractClass> usersList;

	public Gk4ChatMediatorImpl() {
		super();
		usersList = new ArrayList<>();
	}

	@Override
	public void addUser(Gk2UserAbstractClass user) {
		usersList.add(user);
	}

	@Override
	public void sendMessage(String msg, Gk2UserAbstractClass user) {

		for (Gk2UserAbstractClass eachUser : usersList) {
			// To Avoid sending message to the sender itself.
			if (eachUser != user) {
				eachUser.recieveMessage(msg);
			}
		}
	}

}
