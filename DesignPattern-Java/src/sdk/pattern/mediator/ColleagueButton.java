package sdk.pattern.mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	
	private static final long serialVersionUID = 1L;
	private Mediator mediator;

	public ColleagueButton(String caption) {
		super(caption);
	}

	public void setMediator(Mediator mediator) { // Mediator 설정 
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) { // Mediator가 유효/무효를 지시
		setEnabled(enabled);
	}
}