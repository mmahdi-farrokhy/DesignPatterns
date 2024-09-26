package state.withdrawal.statuses;

public class PendingStatus extends WithdrawalStatus {
    @Override
    public void pending() {
        throw new Error("Withdrawal is already in pending state");
    }

    @Override
    public void rejected() {
        withdrawal.transitTo(new RejectedStatus());
    }

    @Override
    public void approved() {
        withdrawal.transitTo(new ApprovedStatus());
    }

    @Override
    public void paid() {
        throw new Error("Pending withdrawal can not go directly to paid state");
    }
}
