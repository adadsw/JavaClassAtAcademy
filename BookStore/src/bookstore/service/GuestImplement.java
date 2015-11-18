package bookstore.service;

import static bookstore.domain.CODE.*;

public class GuestImplement implements Guest {

	private static GuestImplement guest = new GuestImplement();
	private GuestImplement() {}

	public int state = GUEST_LOGOUT;
	@Override
	public void buy() {

	}

	@Override
	public void refund() {

	}

	@Override
	public void guestLogin() {
		state = GUEST_LOGIN;
	}

	@Override
	public void guestLogout() {
		state = GUEST_LOGOUT;
	}

	public static GuestImplement getInstance() {
		return guest;
	}

}
