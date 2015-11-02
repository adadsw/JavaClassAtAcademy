package com.javalec.ex08;

public class _28_MainClass {
	public static void main(String[] args) {

		_28_IFunction aPhone = new _28_APhone();
		_28_IFunction bPhone = new _28_BPhone();
		_28_IFunction cPhone = new _28_CPhone();
		
		/*System.out.println(aPhone + " : " + aPhone.callSenderReceive());
		System.out.println(aPhone + " : " + aPhone.calLte());
		System.out.println(aPhone + " : " + aPhone.tvRemoteController());
		System.out.println();
		System.out.println(bPhone + " : " + bPhone.callSenderReceive());
		System.out.println(bPhone + " : " + bPhone.calLte());
		System.out.println(bPhone + " : " + bPhone.tvRemoteController());
		System.out.println();

		System.out.println(cPhone + " : " + cPhone.callSenderReceive());
		System.out.println(cPhone + " : " + cPhone.calLte());
		System.out.println(cPhone + " : " + cPhone.tvRemoteController());
		System.out.println();*/

		_28_IFunction phone[] = { aPhone, bPhone, cPhone };
		
		for (int i = 0; i < phone.length; i++) {
			System.out.println(phone[i] + " : " + phone[i].callSenderReceive());
			System.out.println(phone[i] + " : " + phone[i].calLte());
			System.out.println(phone[i] + " : " + phone[i].tvRemoteController());
			System.out.println();
		}

	}
}
