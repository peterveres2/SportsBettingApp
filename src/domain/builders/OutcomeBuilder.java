package domain.builders;

import domain.Bet;
import domain.Outcome;
import domain.OutcomeOdd;
import domain.OutcomeOddException;

import java.util.ArrayList;
import java.util.List;

public class OutcomeBuilder {
    private String description; //eg.: 0 goal or 1 goal etc.
    private Bet bet;
    private List<OutcomeOdd> outcomeOdds;

    public OutcomeBuilder() {
        this.outcomeOdds = new ArrayList<>();
    }

    public OutcomeBuilder setBet(Bet bet){
        this.bet = bet;
        return this;
    }

    public OutcomeBuilder setDescription(String description){
        this.description = description;
        return this;
    }

    public OutcomeBuilder addOutcomeOdd(OutcomeOdd oco){
        this.outcomeOdds.add(oco);
        return this;
    }

    public Outcome getOutcome() throws OutcomeOddException {
        return new Outcome(this);
    }

    public String getDescription() {
        return description;
    }

    public Bet getBet() {
        return bet;
    }

    public List<OutcomeOdd> getOutcomeOdds() {
        return outcomeOdds;
    }
}
