package name.abuchen.portfolio.snapshot.filter;

import java.util.Objects;

import name.abuchen.portfolio.model.Account;
import name.abuchen.portfolio.model.AccountTransaction;
import name.abuchen.portfolio.model.Client;

public class ReadOnlyAccount extends Account
{
    private final Account source;

    ReadOnlyAccount(Account source, String name)
    {
        super(name);
        this.source = Objects.requireNonNull(source);
    }

    public Account getSource()
    {
        return source;
    }

    @Override
    public void addTransaction(AccountTransaction transaction)
    {
        throw new UnsupportedOperationException();
    }

    void internalAddTransaction(AccountTransaction transaction)
    {
        super.addTransaction(transaction);
    }

    @Override
    public void shallowDeleteTransaction(AccountTransaction transaction, Client client)
    {
        throw new UnsupportedOperationException();
    }
}
