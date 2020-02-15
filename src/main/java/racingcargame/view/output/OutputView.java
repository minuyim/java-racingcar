package racingcargame.view.output;

import racingcargame.domain.Car;
import racingcargame.domain.Name;
import racingcargame.domain.Names;
import racingcargame.domain.Position;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static final String DISPLAY_POSITION_CHAR = "-";
    public static final String JOIN_CHAR = ", ";

    public static void printResultTitle() {
        System.out.println("\n실행 결과");
    }

    public static void printRound(List<Car> cars) {
        for (Car car : cars) {
            printRoundEach(car);
        }
        System.out.println();
    }

    private static void printRoundEach(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append(car.getName());
        sb.append(": ");
        for (int i = 0; i < car.getPosition().getPosition(); i++) {
            sb.append(DISPLAY_POSITION_CHAR);
        }
        System.out.println(sb.toString());
    }

    public static void printWinners(Names names) {
        String winners = names.getNames().stream()
                .map(Name::toString)
                .collect(Collectors.joining(JOIN_CHAR));
        System.out.println(winners + "이(가) 우승하셨습니다.");
    }
}
