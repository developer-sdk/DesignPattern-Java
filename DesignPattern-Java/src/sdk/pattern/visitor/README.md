# 비지터 패턴 

데이터 구조 안에 많은 요소가 저장되어 있고, 그 요소들에 대해서 무언가 '처리'해 나간다고 합시다.

데이터 구조와 처리를 분리합니다. 그리고 데이터 구조 안을 돌아다니는 주체인 '방문자'를 나타내는 클래스를 준비해서 그 클래스에게 처리를 맡깁니다. 새로운 처리를 추가하고 싶을 때는 새로운 '방문자'를 만들면 됩니다. 

파일과 디렉토리로 구성된 데이터 구조 안을 방문자가 찾아다니는 파일의 일람을 표시하는 프로그램입니다. 