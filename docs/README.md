# 기능 목록

## 입력
- 경주할 자동차 이름을 ,기준으로 입력받는다.
- 시도할 횟수를 입력받는다.

## 입력 검증
- 자동차 이름이 공백이거나 빈값이면 `IllegalArgumentException`을 발생시킨다.
- 자동차 이름이 5자를 초과하면 `IllegalArgumentException`을 발생시킨다.
- 자동차 이름이 중복되면 `IllegalArgumentException`을 발생시킨다.
- 시도할 횟수가 숫자가 아니면 `IllegalArgumentException`을 발생시킨다.
- 시도할 횟수가 1 미만이면 `IllegalArgumentException`을 발생시킨다.

## 자동차 이동
- 0~9 사이의 무작위 값을 발생시킨다.
- 무작위 값이 4 이상이면 전진한다.

## 출력
- 각 횟수별 실행 결과를 자동차 이름과 함께 출력한다.
- 최종 우승자를 출력한다.
- 우승자가 여러 명일 경우 ,로 구분하여 출력한다.