package sdk.pattern.mediator;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
	
	private static final long serialVersionUID = 1L;
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) {
		super(text, columns);
	}

	public void setMediator(Mediator mediator) { // Mediator 설정 
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged();	// 이벤트가 발생하면 중재자에 알림 
	}
}