package State.Withdrawal.statuses;

public class ApprovedStatus extends WithdrawalStatus {
    @Override
    public void pending() {
        throw new Error("Approved withdrawal can not go back to pending state");
    }

    @Override
    public void rejected() {
        throw new Error("Approved withdrawal can not go to rejected state");
    }

    @Override
    public void approved() {
        throw new Error("Withdrawal is already approved.");
    }

    @Override
    public void paid() {
        withdrawal.transitTo(new PaidStatus());
    }
}
