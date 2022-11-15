package lotto;

import java.util.Collections;
import java.util.List;

public class OutputView {

    public void printTickets(List<Lotto> tickets) {
        System.out.println(tickets.size() + "개를 구매했습니다.");
        for (Lotto ticket : tickets) {
            List<LottoNumber> sortedNumbers = ticket.getNumbers();
            Collections.sort(sortedNumbers);
            System.out.println(sortedNumbers);
        }
    }


}
