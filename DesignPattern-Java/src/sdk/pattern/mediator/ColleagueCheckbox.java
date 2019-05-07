package sdk.pattern.mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
	
	private static final long serialVersionUID = 1L;
	private Mediator mediator;

	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) { // 긓깛긚긣깋긏�^
		super(caption, group, state);
	}

	public void setMediator(Mediator mediator) { // Mediator 설정
		this.mediator = mediator;
	}

	public void setColleagueEnabled(boolean enabled) { // Mediator궔귞뾎뚼/뼰뚼궕럚렑궠귢귡
		setEnabled(enabled);
	}

	public void itemStateChanged(ItemEvent e) { // 륉뫴궕빾돸궢궫귞Mediator궸믅뭢
		mediator.colleagueChanged();
	}
}