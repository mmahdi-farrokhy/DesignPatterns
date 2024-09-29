package State.Withdrawal.statuses;

public class PaidStatus extends WithdrawalStatus {
    @Override
    public void pending() {
        throw new Error("Paid withdrawal can not go back to pending state");
    }

    @Override
    public void rejected() {
        throw new Error("Paid withdrawal can not go back rejected state");
    }

    @Override
    public void approved() {
        throw new Error("Paid withdrawal can not go back approved state");
    }

    @Override
    public void paid() {
        throw new Error("Withdrawal is already paid");
    }
}
