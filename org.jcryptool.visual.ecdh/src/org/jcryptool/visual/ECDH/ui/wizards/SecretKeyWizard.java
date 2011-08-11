package org.jcryptool.visual.ECDH.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

import de.flexiprovider.common.math.FlexiBigInt;

public class SecretKeyWizard extends Wizard {
	SecretKeyWizardPage page;
	private String name;
	private int max;
	private int secret;
	private FlexiBigInt largeMax;
	private FlexiBigInt largeSecret;
	private boolean large;

	public SecretKeyWizard(String n, int s, int m) {
		super();
		large = false;
		setNeedsProgressMonitor(true);
		name = n;
		max = m;
		secret = s;
	}

	public SecretKeyWizard(String n, FlexiBigInt s, FlexiBigInt m) {
		super();
		large = true;
		setNeedsProgressMonitor(true);
		name = n;
		largeMax = m;
		largeSecret = s;
	}

	@Override
	public void addPages() {
		if (large)
			page = new SecretKeyWizardPage(name, largeSecret, largeMax);
		else
			page = new SecretKeyWizardPage(name, secret, max);
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		if(large)
			largeSecret = page.getLargeSecret();
		else
			secret = page.getSecret();
		return true;
	}
	
	public int getSecret() {
		return secret;
	}
	
	public FlexiBigInt getLargeSecret() {
		return largeSecret;
	}
}