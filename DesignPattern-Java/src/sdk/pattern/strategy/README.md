# 전략 패턴 

문제를 해결하기 위한 특정 알고리즘을 교환 가능하도록 구현되어 있습니다. 알고리즘을 교체해서 동일한 문제를 다른 방법으로 해결하는 패턴이 전략 패턴입니다. 

클래스|비고
-|-
Hand|가위바위보의 손을 나타내는 클래스 
Strategy|가위바위보의 전략을 타나태는 클래스 
WinningStrategy|이기면 다음에도 같은 손을 나타내는 전략
ProbStrategy|바로 전의 손에서 다음 손을 확률적으로 계산하는 전략 클래스 
Player|가위바위보를 하는 플레이어를 나타내는 클래스 