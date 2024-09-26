package state.withdrawal.statuses;

import state.withdrawal.Withdrawal;

public abstract class WithdrawalStatus {
    protected Withdrawal withdrawal;

    public void setWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public abstract void pending();

    public abstract void rejected();

    public abstract void approved();

    public abstract void paid();
}
