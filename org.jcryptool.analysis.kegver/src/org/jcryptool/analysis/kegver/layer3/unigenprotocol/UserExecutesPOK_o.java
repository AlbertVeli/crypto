package org.jcryptool.analysis.kegver.layer3.unigenprotocol;

import org.jcryptool.analysis.kegver.layer3.U;

public class UserExecutesPOK_o extends UnigenStateSuper implements
		UnigenStateBehavior {

	public UserExecutesPOK_o(UnigenStateContext inUniGen) {
		super(inUniGen);
	}

	public void bothSetup() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userChecksPOK_1() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userAbortsPOK_1() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userSends_Cv() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void caSends_u() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userChecks_u() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userAborts_u() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userSends_Co() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userExecutesPOK_o() {
		// Report
		U.verbose(new Throwable(), "entered");
		
		// Execute this state
		boolean isPOKExecuted = this.getUnigen().getUser().executePOK_o();
		
		// Report
		U.verbose(new Throwable(), 
				"CA: " + this.getUnigen().getCA().toString_() +
				", User: " + this.getUnigen().getUser().toString_() +
				", UnigenData: " + this.getUnigen().getUnigenData() + 
				", POK_1: " + this.getUnigen().getUnigenData().toString() + 
				", Commitment_Cv: " + this.getUnigen().getUnigenData().getCommitment_Cv().toString() +
				", u: " + this.getUnigen().getUnigenData().get_u() + 
				", Commitment_Co: " + this.getUnigen().getUnigenData().getCommitment_Co().toString() +
				", isPOKExecuted: " + isPOKExecuted);
		
		// Trigger next state
		this.getUnigen().setState(UnigenStateContext.getCaVerifiesPOK_o());
		this.getUnigen().caVerifiesPOK_o();			
	}
	
	public void caVerifiesPOK_o() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void caAbortsPOK_o() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void userExecutesPOK_z() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void caVerifiesPOK_z() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void caAbortsPOK_z() {
		U.verbose(new Throwable(), "Wrong state");
	}

	public void bothAreHappy() {
		U.verbose(new Throwable(), "Wrong state");
	}
}