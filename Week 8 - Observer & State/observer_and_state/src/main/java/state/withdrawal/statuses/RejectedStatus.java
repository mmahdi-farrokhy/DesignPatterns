package state.withdrawal.statuses;

public class RejectedStatus extends WithdrawalStatus {
    @Override
    public void pending() {
        throw new Error("Rejected withdrawal can not go back to pending state");
    }

    @Override
    public void rejected() {
        throw new Error("Withdrawal is already rejected.");
    }

    @Override
    public void approved() {
        throw new Error("Rejected withdrawal can not go to approved state");
    }

    @Override
    public void paid() {
        withdrawal.transitTo(new PaidStatus());
    }
}
