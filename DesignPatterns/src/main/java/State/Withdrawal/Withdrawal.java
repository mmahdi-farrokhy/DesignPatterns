package State.Withdrawal;

import State.Withdrawal.statuses.WithdrawalStatus;

public class Withdrawal {
    private final double amount;
    private WithdrawalStatus status;

    public Withdrawal(double amount) {
        this.amount = amount;
    }

    public void transitTo(WithdrawalStatus status) {
        this.status = status;
        this.status.setWithdrawal(this);
    }

    public void pending() {
        status.pending();
    }

    public void rejected() {
        status.rejected();
    }

    public void approved() {
        status.approved();
    }

    public void paid() {
        status.paid();
    }
}
